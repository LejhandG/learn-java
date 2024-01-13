public class Main {
    public static void main(String[] args) {
        Vehicles vehicle = new Vehicles(2, 5);
        System.out.println(vehicle.toString());
        vehicle.noOfGears();
        vehicle.noOfTires();
        Bike bike = new Bike(2,6,100);
        System.out.println(bike.toString());
        bike.noOfGears();
        bike.noOfTires();
        Car car = new Car(4,5,180);
        System.out.println(car.toString());
        car.noOfGears();
        car.noOfTires();
    }
}
