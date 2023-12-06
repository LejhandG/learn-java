//What are operators?
//Operators in Java are special symbols that perform specific operations on one, two, or three operands, and then return a result.
//Example
int a = 10+2; //Here there are two operators: One is = equal too and the other is +
//What are operands?
//An operand is a term used to describe any object that is manipulated by an operator. So if we consider this
int myExample = 10+2; //10 and 2 are the operands
int myExample2 = a + myExample; //here a and myExample are operands
//What are expressions?
//It is basically a combination of all variables, literals, operators, method return values etc
int variable = 10+2; //This is an expression
//What are comments?
//Comments are lines in a code that are ignored by the computer
// - This is a single line comment (two forward slashes)
/*
This is a
multiline comment
*/
//Important: Note that two characters dont get concatenated by the + sign
//They get converted to their ASCII value and get added
int testChar1 = 'A';
int testChar2 = 'B';
System.out.print(testChar1 + testChar2); //This will not print AB but it will print 65+66 value
//But if you want this to get concatenated just add an empty String
System.out.print(""+testChar1+testChar2); //This will print AB as we added an empty String so the other two operands convert into String and get concatenated
//What is the remainder operator?
//The remainder operator is the operator which prints the remainder after division
//Use % to find the remainder example
int testRemainder = 11%2; //This will print 1 as 11 divide by 2 leaves the remainder 1
