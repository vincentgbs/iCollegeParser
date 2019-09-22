#!/bin/bash

echo "parsing directory: $1"

if [ -d "./$1" ]
then
    echo "Directory $1 exists."
    for file in $1/*
    do ### start forloop
        if [ ${file: -5} == ".java" ]
        then
            ### iCollege bulk download format
            ### regex only tested on mac
            studentName=$( echo $file | sed -E 's~(^[a-zA-Z]+\/[0-9]+-[0-9]+ - )(.+ .+)( - [a-zA-Z]{3} [0-9]{1,2}, [0-9]{4} [0-9]{1,4} [AP]M - [a-zA-Z_]+\.java)$~\2~g')
            javaFileName=$(echo $file | sed -E 's~(^[a-zA-Z]+\/[0-9]+-[0-9]+ - )(.+ .+)( - [a-zA-Z]{3} [0-9]{1,2}, [0-9]{4} [0-9]{1,4} [AP]M - )([a-zA-Z_]+\.java)$~\4~g')
            valid='a-zA-Z \-' ### valid name characters
            if [[ ! $studentName =~ [^$valid] ]]
            then
                studentName=$(echo $studentName | tr -d " \t\n\r") ### remove spaces
                mkdir -p "$1/$studentName"
                mv "$file" "$1/$studentName/$javaFileName"
            else
                echo "Error: $studentName is not a valid name"
            fi
        else
            ### skip processing
            echo "Error: $file is not a java file"
        fi
    done ### end forloop
else
    echo "Error: Directory $1 does not exists."
fi
