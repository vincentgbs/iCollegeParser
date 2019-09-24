This script is meant to be run WITHIN the folder that is downloaded and unzipped from iCollege.

This script is meant to parse a bulk downloaded file into folders that hold each student's submission, instead of one folder with all submissions. It should also rename the file to the relevant class name. Special characters within the student's name or the java class name can break the script. There will be some files that will still need to be parsed by hand.

setup notes:
First rename the downloaded folder to 'zipfile' manually.
You may need to run the below command to make the script executable:
```bash
chmod 700 parsingScript.sh
```
You can run the script using:
```bash
./parsingScript.sh zipfile/
```

iCollege download format:
![image](https://raw.githubusercontent.com/vincentgbs/iCollegeParser/master/zipfileraw.png)

Script result format:
![image](https://raw.githubusercontent.com/vincentgbs/iCollegeParser/master/formatted.png)



The "automated grader" feature is lacking, it only verified about 10% of the homework submissions to be correct. However, the script still has the advantage of compiling most of the assignments, so you can just cd between directories (by student name) and java _____Client to test the functionality faster.
