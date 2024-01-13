public class Main {
    public static void main(String[] args) {
        Encapsulate car = new Encapsulate();
        car.setBrand("Porsche");
        car.setModel("911");
        car.setColor("Yellow");
        car.setPrice(2_00_00_000); //underscores are just for removing confusions
        //Now if we fetch the value
        System.out.println("The car I want to buy is: \nBrand: " + car.getBrand() +
                "\nModel: " + car.getModel() +
                "\nColor: " + car.getColor() +
                "\nPrice: " + car.getPrice());
        //We can also use constructors to make the setter process easy
        Encapsulate car2 = new Encapsulate("Tata", "Nexon", "Black", 12_00_000);
        System.out.println("The another model available is: " +
                "\nBrand: " + car2.getBrand() +
                "\nModel: " + car2.getModel() +
                "\nPrice: " + car2.getPrice());
    }
}
