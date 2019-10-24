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
If you want to automated grading, you can write Test Cases. You will need to comment out the test case code in the script. After the script runs with those 3 arguments, the students directories that passed all of your test cases will have a file marking them as correct. The other directories will still require manual checking.
The "randomstring" variable is the file that is created within the directory if the code passed all of the tests. This is so that students can't put a file in the folder marking it correct.
```bash
./parsingScript.sh zipfile Triangle randomstring
```

iCollege download format:
![image](https://raw.githubusercontent.com/vincentgbs/iCollegeParser/master/zipfileraw.png)

Script result format:
![image](https://raw.githubusercontent.com/vincentgbs/iCollegeParser/master/formatted.png)



The "automated grader" feature is lacking, it only verified about 10% of the homework submissions to be correct. However, the script still has the advantage of compiling most of the assignments, so you can just cd between directories (by student name) and java _____Client to test the functionality faster.
