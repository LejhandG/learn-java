public class Bike extends Vehicles { //So now it is the child class and inherits the properties of vehicles so we use extends
    private int cc;

    public Bike(int tires, int gears, int cc) { //We accept number of tires, gears and the cc
        //But how did we accept the number of tires and gears?
        //We inherit the qualities of Vehicles into Bike by using extends
        super(tires, gears); //and to use the constructor of Vehicles we use the keyword super
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "cc=" + cc +
                '}';
    }
}
