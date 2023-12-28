import java.util.Scanner; //import this library so that we can use Scanner

public class InputUsingConsole {
    public static void main(String[] args) {
        int currentYear = 2022;
        System.out.println(getInputFromConsole(currentYear)); //We are calling the following method
        System.out.println(getInputFromScanner(currentYear));
    }
    public static String getInputFromConsole(int currentYear) { //Here we are creating a method to accept input from the console/terminal
        String name = System.console().readLine("Hi what is your name?"); //System.console() accepts input and .readLine displays the text
        System.out.println("Your name is " + name);
        return "";
        //Note: Console input does not work when ran directly using the ▶️ button
        //For console input to work you have to click the terminal option in an IDE and write java yourFileName
    }
    public static String getInputFromScanner(int currentYear) {
        Scanner ob = new Scanner(System.in); //Scanner is the class we are importing from java.util.Scanner
        //ob is the object variable, new Scanner is we are creating a new Scanner object
        //System.in signifies we are taking an input eg: System.out represents output
        System.out.println("Hello. Whats your name?");
        String name = ob.nextLine();
        System.out.println("Your name is " + name);
        /*
        Basics you should know
        int - .nextInt()
        double - nextDouble()
        char - nextLine().charAt()
        String - nextLine()
         */
        return "";
    }
}
//Also note to convert String to int use Integer.parseInt
