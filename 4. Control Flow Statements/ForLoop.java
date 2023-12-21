public class ForLoop {
    public static void main(String[] args) {
        /*
        What is looping?
        Looping lets us execute code multiple number of times
        There are three types of loops
+----------+-----------------------------------------------+
| for      | The widely and most commonly used loop        |
+----------+-----------------------------------------------+
| while    | This loop executes until a condition is false |
+----------+-----------------------------------------------+
| do while | This loop atleast executes once a stops when  |
|          | the condition becomes false                   |
+----------+-----------------------------------------------+
        */
        /*
        The syntax of for loop is
        for(initialization; expression; increment) {
            //block of code
        }
         */
        for(int i=1;i<=10;i++) {
            System.out.print(i+" ");
        }
        /*
        The syntax of while loop is
        while(condition) {
            //block of code
        }
         */
        int condition=10;
        while(condition>1) {
            System.out.print(condition + " ");
            condition--;
        }
        /*
        The syntax of do-while loop is
        do {
            //block of code
         }while(condition);
         */
        int conditionTwo = 10;
        do {
            System.out.print(conditionTwo+" ");
            conditionTwo--;
        }while(conditionTwo>10);
        //Also you can use break; statements in loops to exit a loop example
        for(int j=0;j<=10;j++) {
            if(j==5) break; //So here the loop will stop at 5 as there is a break statement
            }
        }
    }
}
