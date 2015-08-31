Java Datatypes
==============

Introductory Problem 6:
=======================
  
Problem:  
Given an integer number, you have to determine which of these datatypes you can use to store that number. If there are multiple suitable datatypes, list them all in the order above.  
  
To make the problem easier, some part of the code is already provided in the editor.  

Input Format:  
The first line will contain an integer T, which denotes the number of inputs that will follow. Each of the next T lines will contain an integer n. The number can be arbitrarily large or small!  
  
Output Format:  
For each n, list all the datatypes it can be fitted into ordered by the size of the datatype. If it can't be fitted into any of these datatypes, print "n can't be fitted anywhere." See the sample output for the exact formatting.

  
Sample Input:  
>
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000  

Sample Output:  
>
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long 

Explanation:
>
-150 can be fitted in a short or in an int or in a long. 213333333333333333333333333333333333 is way too large to fit in any datatypes mentioned in the problem statement.