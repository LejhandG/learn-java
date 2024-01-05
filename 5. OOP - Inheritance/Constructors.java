public class Constructors {
    private int age;
    private String name;
    /*
    A constructor in Java is a special method that is used to initialize objects.
    It is called when an instance of the class is created.
    In simpler terms, a constructor is a block of code that is executed when an object of a class is created.
    It has the same name as the class and does not have a return type
     */
    //So in the previous file we made many setters so in constructors you could group up all the setters into one constructor
    //So instead of
    /*
            public void setAge(int age) {
            this.age = age;
        }
               public void setName(String name) {
            this.name = name;
        }
        We can do is
     */
    public Constructors(int age, String name) { //Note the name should be same as the class
        this.age = age;
        this.name = name;
    }
    //You could also do constructor overloading by passing diff number of parameters
    public Constructors(int age) {
        this.age = age;
    }
    public Constructors() {
        System.out.println("Empty");
    }
    /*
    In the Main.java file when you create a new object to inherit you use
    Constructors con = new Constructors(18, "Dhruv"); to preset the values and not use setters
     */
}
