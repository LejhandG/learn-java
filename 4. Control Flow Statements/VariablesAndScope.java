public class VariablesAndScope {
    int global; //This is a global variable which can be used anywhere inside the class
    public static void main(String[] args) {
        //What is a local variable
        //It is a variable which is only available for use by the code block in which it was declared
        //Example:
        int a = 10; //This variable can be used throughout psvm
        if(a==10) {
            int b = 10; //This variable can only be used in the if statement
        }
        //What is scope?
        //Scope defines the accessibility of a variable
        //So for example local variables are always out of scope for the outer block
    }
}
