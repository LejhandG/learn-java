public class POJO {
    //What is a POJO?
    //The full-form of POJO is a Plain Old Java Object
    /*
    A plain old Java object (POJO) is a class definition that is not tied to any Java framework so any Java program can use it.
    A POJO has no particular naming convention for properties and methods, or any other special restrictions.
    Their primary advantage is their reusability and simplicity.
    Example code:
     */
    private int rollno;
    private String name;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public POJO(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    //This is a plain old java object as it does not import any other external frameworks
    //This code is compatible and will work on most of the devices having JRE
}
