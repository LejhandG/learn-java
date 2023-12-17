public class MethodOverloading {
    public static void main(String[] args) {
        //What is method overloading?
        //In simple terms it is when the same method is declared with different number of parameters
        //So you can call a method with the same name but declare different arguments
        //Example:
    }
    public static void doSomething(int parameter) {}
    public static void doSomething(float parameter) {}
    public static void doSomething(int parameterA,int parameterB) {}
    public static void doSomething(float parameterA, float parameterB) {}
    public static void doSomething(int parameterA,int parameterB,float parameterC) {}

    //Wrong Overloading methods
    /*
    public static void main(int parameterA) {}
    public static void main(int parameterB) {} //This is incorrect as the number of parameters is the same as the above one
    public static int main(int parameterA) {return 0;} //This is incorrect as the return type is changed
     */
}
