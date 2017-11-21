
Assuming you are in the directory containing this README:

## To clean:
ant -buildfile src/build.xml clean

-----------------------------------------------------------------------
## To compile: 
ant -buildfile src/build.xml all

-----------------------------------------------------------------------
## To run by specifying arguments from command line 
## We will use this to run your code
ant -buildfile src/build.xml run -Darg0=INPUT_FILE -Darg1=OUTPUT_FILE -Darg2=DEBUG_VALUE
-----------------------------------------------------------------------

## To create tarball for submission
ant -buildfile src/build.xml tarzip or tar -zcvf michael_plohetski_john_null_assign_5.tar.gz michael_plohetski_john_null_assign_5

-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.Ã¢â‚¬Â
John Null
Michael Plohetski


[Date: 11/21/2017]

-----------------------------------------------------------------------

Provide justification for Data Structures used in this assignment in
term of Big O complexity (time and/or space)

Binary Search Tree
Average Cases:
Space - O(n)
Search - O(log n)
Insert - O(log n)
Delete - O(log n)

Worst Cases:
Space - O(n)
Search - O(n)
Insert - O(n)
Delete - O(n)

Results class StringBuffer
Average Case & Worst Case
Insert - O(1)
other operations aren't used
-----------------------------------------------------------------------

Provide list of citations (urls, etc.) from where you have taken code
(if any).
Prime check
https://www.mkyong.com/java/how-to-determine-a-prime-number-in-java/
