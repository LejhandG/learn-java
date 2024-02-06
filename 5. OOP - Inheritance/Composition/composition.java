/*
Composition in Java:

In Java, composition refers to the design technique where a class contains an object of another class as a member. This means that one class is composed of one or more objects of other classes. 

In simpler terms, composition is like putting together Lego blocks to build something bigger. Each block (object) serves a specific purpose, and by combining them, you create a more complex structure.

**Example:**

Let's say we have two classes: `Car` and `Engine`. Instead of making `Car` inherit from `Engine`, we can compose `Car` with an `Engine` object. This means that a `Car` has an `Engine`, but it's not the same as saying a `Car` is an `Engine`.
*/
public class Engine {
    // Engine properties and methods
}

public class Car {
    private Engine engine; // Composition: Car has an Engine

    // Constructor
    public Car(Engine engine) {
        this.engine = engine;
    }

    // Other methods and properties of Car
}
/*
Inheritance vs. Composition:

**Inheritance:**
- Inheritance is an "is-a" relationship, where a subclass inherits behaviors and attributes from a superclass.
- It promotes code reuse and establishes a hierarchy among classes.
- It represents an "is-a" relationship, where a subclass is a specialized version of the superclass.

**Composition:**
- Composition is a "has-a" relationship, where a class contains an object of another class.
- It allows flexibility by allowing classes to change behavior at runtime by changing the composed object.
- It represents a "has-a" relationship, where one class has another class as a part of its structure.

**Example:**

Let's take the example of `Car` and `Engine` again:
*/
// Inheritance
public class Car extends Engine {
    // Car inherits properties and methods from Engine
}

// Composition
public class Car {
    private Engine engine; // Car has an Engine

    // Constructor
    public Car(Engine engine) {
        this.engine = engine;
    }

    // Other methods and properties of Car
}

// In the inheritance example, `Car` is a type of `Engine`, while in the composition example, `Car` has an `Engine`.