public class Vehicles {
    protected int tires;
    protected int gears;

    //We use protected here as we only want the child class to access the variables and no other file

    //So now we'll make the constructor
    //So what is inheritance basically?
    /*
    Inheritance is a fundamental concept in object-oriented programming that allows one class to inherit the properties and methods of another class.
    In Java, inheritance is achieved using the extends keyword.
    The class that is being inherited from is called the superclass or parent class,
    while the class that inherits from it is called the subclass or child class.
     */
    //So here as we see Vehicles is the parent class and Bike and Car are their children
    //So as we know biology the child inherits some properties of their parents
    //Same is in java so the child classes inherit properties of their parents class

    //Let's make a constructor

    public Vehicles(int tires, int gears) {
        this.tires = tires;
        this.gears = gears;
    }

    //Default constructor(empty)
    public Vehicles() {}

    public void noOfTires() {
        if(tires==2) {
            System.out.println("It is a two wheeler vehicle!");
        }
        else if(tires==4) {
            System.out.println("It is a LMV!");
        }
        else {
            System.out.println("Out of scope!");
        }
    }

    public void noOfGears() {
        System.out.println("It has " + gears  + " gears!");
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "tires=" + tires +
                ", gears=" + gears +
                '}';
    }
}
