public class IfThen {
    public static void main(String[] args) {
        //Setting value of isAdult to false
        boolean isAdult = false;
        //if else stataement is the most basic of all the control flow statements
        //it executes a certain part of code if the condition returns true
        //Note: There is no semicolon after the if statement
        //Here you can see double equals is used to check whether LHS is equal to RHS
        //Here LHS is not equal to RHS hence the below code is not executed and we jump to the else statement
        if (isAdult == true) {
            //an if statement works without brackets if and only if
            //there is only one line of code after the if
            System.out.println("You can vote!");
            //if no condition is met the code directly jumps to the else statement
            //and executes the code inside the else body
        } else {
            System.out.println("You cannot vote!");
        }
    }
    }
	//You can also use else if statement to add more conditions in between