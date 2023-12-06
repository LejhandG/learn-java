//This is the first day of me uploading Java Basics
//Firstly go to https://www.oracle.com/java/technologies/downloads/#java17 and install Java JDK 17
//After successfull installation open "Command Prompt" and type java --version
//If you get a text with the version you have installed it correctly
//We would be currently just run snippets in the Command Prompt using Jshell so
//Press Windows+R -> Type cmd -> Open command prompt -> Write jshell and then press enter
//It would start the Jshell prompt
//What is Jshell?
//Jshell is an environment where you can run single line codes or snippets or statements
//So now we will print out first "Hello World Program" so type the below in the Jshell Prompt

System.out.print("Hello World"); //Type this and press enter. You wouldve received an output saying Hello World. You have successfully executed your first line of code
//System.out.print -> This is used to print or display. This is similar to printf in C, print in Python, cout in C++
System.out.print("Hello World");
System.out.println("Hello World");
//Now what is the difference between both the codes?
//System.out.print -> In this we observe we write System.out.print so if the code contains just print it would print the next output on the same line
//System.out.println -> In this we observe we write System.out.println -> ln means new line so if we write ln it would print the next output in a new line
//System.out.print and System.out.println are inbuilt functions in java to print
//Also the above is a statement
//So what is a statement? It is a command to be executed

//Also note: Java is also a Case Sensitive language i.e System.out.println and system.out.println are different -> the second statement will give an error
//So note the S of System.out.print is Capital So
System.out.println("This is correct");
system.out.println("This is wrong");

//Also not to print something in Java always use " " double quotes and not single quotes as if you use single quotes it will throw an error
System.out.print("This is correct");
System.out.print('This is wrong');

//So now we move to our next topic
