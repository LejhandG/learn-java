public class Method {
    public static void main(String[] args) {
        //A method is a block of code or a set of instructions grouped together to achieve a certain task or operation.
        //Think of it as a reusable set of actions that you can call whenever needed.
        //The basic syntax of a method is
        /*
        public static void methodName() {
        Method code form the method body
        }
        */
        //We are calling the method here
        //When we call the method the flow of code transfers to the called method and the code inside that runs
        //After the code in the method is ran it comes back to the main method and runs the existing code/remaining code
        addition();
        int a = 10, b = 11;
        add2(a, b);
        //You can also pass direct values instead of the variable names
        add2(10, 11);
        //So what method does is that instead of writing the code again and again we can reuse the code to improve readability and make it easier
        System.out.println(add3(10,11));
    }

    //We are declaring the code of the method or the task which the method should perform
    public static void addition() {
        int a = 10, b = 11;
        System.out.println(a + b);
    }

    //If you want to make a method were you can pass your own variable values so use the following syntax
    /*
    public static void methodName(datatype parameter1, datatype parameter2 ....) {
        //code of the method
    }
     */
/*
+---------------------------------------+---------------------------------+
| Parameters                            | Arguments                       |
+---------------------------------------+---------------------------------+
| Parameter is the defination           | Arguments is the actual value   |
| shown in the method declaration       | passed while calling the method |
+---------------------------------------+---------------------------------+
| Example:                              | Example:                        |
| public static void sum(int a,int b) { | int a=10,b=11;                  |
| }                                     | sum(a,b);                       |
+---------------------------------------+---------------------------------+
*/
//So now we will create a method with parameters
    public static void add2(int a, int b) {
        System.out.println(a + b);
    }
//Also there are methods with return types which are written in the following syntax
/*
public static int main() {
return someValue;
}
 */
//What is return?
//When a method finishes its job, it can use the return statement to send a result back to whoever called it.
//Imagine a chef making a delicious dish. Once it’s ready, the chef hands it over to the waiter (that’s the return part).
//Example:
    public static int add3(int a,int b) {
        return a+b;
    }
}