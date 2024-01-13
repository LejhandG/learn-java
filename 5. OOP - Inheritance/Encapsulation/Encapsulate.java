public class Encapsulate {
    //Initializing private variables hence encapsulation can work
    private String brand;
    private String model;
    private String color;
    private int price;

    //Now initializing getters as other files can access the value of the variables

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    //Now initializing setters as other files can set the value they want to

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //Making a constructor as individual setters are confusing

    public Encapsulate(String brand, String model, String color, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public Encapsulate() {}
}
