//Primitive data types are the most basic data types in Java
//The eight primitive data types are as follows
//WHOLE NUMBER
int //Allows integer values in a particular range OPTIONAL: to know the minimum and maximum range use Integer.MIN_VALUE; and Integer.MAX_VALUE
byte
short
long
//DECIMAL NUMBERS
float
double
//CHARACTER
char
//YES/NO
boolean
/*
+-----------+------------------+-------------+------------+
| Data Type | Width (in bytes) | Min Value   | Max Value  |
+-----------+------------------+-------------+------------+
| byte      | 8                | -128        | 127        |
+-----------+------------------+-------------+------------+
| short     | 16               | -32768      | 32767      |
+-----------+------------------+-------------+------------+
| int       | 32               | -2147483648 | 2147483647 |
+-----------+------------------+-------------+------------+
*/
//Also to print a variable value along with a simple text use the + sign
//+ sign is used to join the simple text and a variable Example:
int age = 18;
System.out.print("My age is:" + age); //This will print: My age is: 18
//So basically the + sign changes the variable to String (simple text) and concatenates (join) it to the previous String

//CLASSES
//So what is a class?
//A class is a building block for Object Oriented Programming and allow us to build custom data types
//Java uses Wrapper Class for all its primitive data types
//A wrapper class is A wrapper class provides simple operations, as well as some basic information about the
//primitive data type, which cannot be stored on the primitive itself.
//So the primitive types and their respective wrapper classes
/*
Primitive | Wrapper Class   
byte      |    Byte
short     |    Short
char      |    Character
int       |    Integer
long      |    Long
float     |    Float
double    |    Double
boolean   |    Boolean
*/
//Example is: Integer.MIN_VALUE;

//What is Overflow and Underflow in Java
//Overflow is when the value is more than the max limit of the datatype
//Underflow is when the value is lesser than the min limit of the datatype
//Also to make a number readable how we put , commas between numbers in normal typing
//We use _ underscore to make the number more readable
int wrong = 1,24,18,957; //Wrong Syntax
int correct = 1_24_18_957;
//Now to the next topic
