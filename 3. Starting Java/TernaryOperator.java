public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10,b=11;
        //Ternary operator is a shortcut of an if else statement
        //it is written in the following syntax
        /*
        datatype variable = condition ? true:false;
        so if the condition returns true it executes the code on the left of the :
        and if the condition returns false it executes
         */
        String reply = (a>b) ? "A is greater" : "B is greater";
        System.out.println(reply);
    }
}
