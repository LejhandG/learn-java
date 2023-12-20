public class SwitchCase {
    public static void main(String[] args) {
        //Switch case is a type of control flow similar to if-else
        /*
        Syntax is like
        switch(value) {
        case 1:
        //code
        break;
        case 2:
        break;
        default:
        }
         */
        int switchValue = 1; //So here we initialize the value
        switch(switchValue) { //here the value gets checked and the switch matches the value with the cases below
            case 1: //here the value gets matched so it will print the code in the block
                System.out.println(1); //1 will be printed
                break; //break is required to exit once the condition is met or else it will print the thing below until break is met
            case 2:
                System.out.println(2);
                break;
            default: //The default case is printed when none of the cases match the value
                System.out.println("None");
                break;
        }
                //Cases can even be char but not float,long,double,boolean
                //Also the cases can be in any order like case 2: then case 1:
            //To have the same output for multiple conditions use
            switch (switchValue) {
                case 1:
                case 2: //Use cases one below the other without using break in between
                case 3: //Note no case should be repeated and you can also write as case 1: case2: case 3:
                    System.out.println(switchValue);
                    break;
                default:
                    break;
            }
            //What is enhanced switch?
        //The following are the examples of enchanced switch
        switch (switchValue) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            default -> System.out.println("4");
        }
        switch (switchValue) {
            case 1 -> {
                System.out.println("1");
                switchValue += 1;
            }
            case 2 -> {
                System.out.println("2");
                switchValue += 2;
            }
            default -> {
                System.out.println("None");
                switchValue -= 1;
            }
        }
        switch (switchValue) {
            case 1, 2, 3 -> {
                System.out.println("1");
                switchValue += 1;
            }
            default -> System.out.println("None");
        }
            }
            public static boolean main(int value) {
                return switch (value) {
                    case 1 -> true;
                    case 2 -> false;
                    case 3 -> true;
                    case 4, 5, 6 -> false;
                    default -> true;
                }; //Note in return switch you cannot use return inside the case code block so use yield instead exampke
                //case 4 -> {
                //yield true;
                //}
            }
        }
        //What is fallthrough? When you forget adding breaks it will print all the cases from when the case is matched to the end
//How does enhanced switch case work in methods