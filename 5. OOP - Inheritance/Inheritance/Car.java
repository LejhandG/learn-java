public class Car extends Vehicles {
    private int maxSpeed;

    public Car(int tires, int gears, int maxSpeed) {
        super(tires, gears);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
