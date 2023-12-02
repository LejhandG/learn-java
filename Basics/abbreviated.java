//Abbreviated operators are shortform of operators
//Example:
int result = 10;
result = result + 1; //We can do this to increment the result by one
//Or we can use increment operators to increment
result++; //This increments the result by one
result+=1; //This also increments by one
//These are called Abbreviated operators
//Note you cannot increment or decrement double value to/from int i.e
result-=5.5; //This is wrong and will give an answer 10-6 i.e 4 as it rounds off
//So to get the accurate value do
result = (double) result - 5.5;
//Also dont do
result = result - 5.5; //This is also wrong
//So basically result-=5.5 is result = (int) (result-5.5);
//Which gives the answer 4
//Also to get a correct answer initialize using a correct datatype
double testAb = 10;
testAb-=5.5;
//Now you will get the correct answer
//Other shorthand operators
/*
+------------------------------------+-------------+
| Shorthand Operator                 | Code Sample |
+------------------------------------+-------------+
| Post-fix Increment Operator        | a++         |
+------------------------------------+-------------+
| Pre-fix Increment Operator         | ++a         |
+------------------------------------+-------------+
| Post-fix Decrement Operator        | a--         |
+------------------------------------+-------------+
| Pre-fix Decrement Operator         | --a         |
+------------------------------------+-------------+
| Addition Compound Assignment       | a+=1        |
+------------------------------------+-------------+
| Subtraction Compound Assignment    | a-=1        |
+------------------------------------+-------------+
| Multiplication Compound Assignment | a*=1        |
+------------------------------------+-------------+
| Division Compound Assignment       | a/=1        |
+------------------------------------+-------------+
*/
//Difference between post-fix and pre-fix operator is
//Example:
int preFix = 10;
int postFix = 10;
System.out.print("Prefix is: " + ++preFix + " Post fix is: " + postFix++);
//Here it will print Prefix is: 11 Post fix is: 10
//Because in prefix value is added instantly and in postfix it is added displayed the next time the variable is used
