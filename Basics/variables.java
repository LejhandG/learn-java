//Now we move to the second part of the basics
//First what are keywords? Keywords are reserved words which cannot be used as a variable name
//What are variables? They are names given to the address of data which make them easier to remember instead of remembering the address name
//How do we know which words are keywords? You could go to https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html#jls-3.9 and check which words are keywords
//What are datatypes? The type of data which you want to store in a variable. The syntax is as follows
// datatype variable_name = data; Example:
int age = 18; //This is a declaration statement which is a statement used to define variable by indicating data type and a name and a value
//Also note a semicolon is compulsory at the end of the Java statement as it indicates the end of a statement and the start of the another statement
//Now how do we print the above variable data
System.out.print("age"); //This is wrong this will print age
System.out.print(age); //This will print 18 which is the value stored in age
//How do we change a variable value in Java?
//Example:
int a = 10;
//To change it just declare it once more without the datatype i.e
a = 20; //So now the value has changed and if you do System.out.print(a) youll get 20 as the output instead of 10
//This is called redeclaring a variable
//You can also store data such as
a = 10+5;
//So java will now detect an operator and automatically store the sum of both i.e 15
//Operators in java perform operations. The most basic are +,-,*,/
//Now we move on to our next topic
