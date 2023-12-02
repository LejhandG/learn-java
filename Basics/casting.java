//Initialization of Many Variables of the Same Datatype
int a=10,b=11; //This is correct
int a=10;b=11; //This is wrong
int a=10,int b=11; //This is also wrong
int a=10;int b=11;//This is correct option

//Overflow example
byte number = Long.MAX_VALUE; //This will throw an error because the size exceeds the datatype max limit
//So we use type casting which is forced conversion from one datatype to another
byte number = (byte) Long.MAX_VALUE;
//Examples
double divide = 8.0/2;
System.out.println(divide); //The output will be 4.0
System.out.println((int)divide); //The output will be 4
//So we converted the double value into int forcefull
//Which is called type casting or explicit type conversion
