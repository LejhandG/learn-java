public class Introduction {
        //What is OOP (Object-Oriented Programming)?
        /*
        Object-Oriented Programming (OOP) is a way of writing computer programs that makes it easier to organize and reuse code.
        It does this by breaking down the program into smaller pieces called objects that can be used over and over again in different parts of the program.
        In Java, OOP is implemented through the use of classes and objects. A class is like a blueprint for creating objects, while an object is an instance of a class.
        OOP has several advantages over other programming paradigms, such as procedural programming.
        It provides a clear structure for programs, makes code easier to maintain, modify, and debug, and allows for the creation of reusable applications with less code and shorter development time1
         */
        //They are also called as class based programming
        //An object has a state and a behavior
        /*
        A class member is a field, or a method, or some other type of dependent element
        Inheritance is a fundamental concept in object-oriented programming (OOP) that allows one class to inherit the properties and methods of another class. In simpler terms, it is a mechanism in Java by which one class is allowed to inherit the features of another class 1.
        In Java, inheritance means creating new classes based on existing ones.
        A class that inherits from another class can reuse the methods and fields of that class.
        In addition, you can add new fields and methods to your current class as well.
        What is encapsulation?
        Encapsulation in Java is a fundamental concept in object-oriented programming (OOP) that refers to the bundling of data and methods that operate on that data within a single unit, which is called a class in Java ¹. It is a way of hiding the implementation details of a class from outside access and only exposing a public interface that can be used to interact with the class. In Java, encapsulation is achieved by declaring the instance variables of a class as private, which means they can only be accessed within the class. To allow outside access to the instance variables, public methods called getters and setters are defined, which are used to retrieve and modify the values of the instance variables, respectively. By using getters and setters, the class can enforce its own data validation rules and ensure that its internal state remains consistent ¹.
        Here is an example of how encapsulation can be implemented in Java:
         */
        private String name;
        private int age;

        public String getName() {
                return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
}
//In the above example, the `Person` class has two instance variables, `name` and `age`, which are declared as private. The class also has public getter and setter methods for these variables, which allow outside access to the instance variables while still enforcing the class's data validation rules.
//You can create another file where you can import this as an object
/*
Main.java
public class Main {
    public static void main(String[] args) {
        Introduction intro = new Introduction(); //<- object creation
        //To get a value use the getter which are usually named starting with get
        intro.getAge(); -> this fetches the value of the age and to set the value
        use a setter which is usually named with set
        intro.setName("Dhruv"); //this sets the name to Dhruv so now if you get the name
        intro.getName(); //It will return Dhruv
 */