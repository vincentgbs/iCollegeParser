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
            echo $file | sed -E 's~(^[a-zA-Z]+\/\/[0-9]+-[0-9]+ - )(.+ .+)( - [a-zA-Z]{3} [0-9]{1,2}, [0-9]{4} [0-9]{1,4} [AP]M - [a-zA-Z_]+\.java)$~\2~g' | (read studentName; echo $studentName)
            echo $file | sed -E 's~(^[a-zA-Z]+\/\/[0-9]+-[0-9]+ - )(.+ .+)( - [a-zA-Z]{3} [0-9]{1,2}, [0-9]{4} [0-9]{1,4} [AP]M - )([a-zA-Z_]+\.java)$~\4~g' | ( read javaFileName; echo $javaFileName)
            # CLASSPATH=./
        else
            ### skip processing
            echo "$file is not a java file"
        fi
    done ### end forloop
else
    echo "Error: Directory $1 does not exists."
fi
