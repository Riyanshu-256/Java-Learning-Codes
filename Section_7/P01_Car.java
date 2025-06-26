package Section_7;

public class P01_Car {
    public static void main(String[] args) {
        
    }

    private String make = "Tesla"; 
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String grtMake() {
        return make;
    }
    public String grtModel() {
        return model;
    }
    public String grtColor() {
        return color;
    }
    public int grtDoors() {
        return doors;
    }
    public boolean grtConvertible() {
        return convertible;
    }

    public void setMake(String make) {

        if( make == null ) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;  // this => to describe itself
    }

    public void setDoors(int doors) {
        this.doors = doors;  // this => to describe itself
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;  // this => to describe itself
    }

    public void setColor(String color) {
        this.color = color;  // this => to describe itself
    }


    public void describeCar() {
        System.out.println(doors + "-Door " + color + " " + make + " " + model + " " + (convertible ? "Convertible" : ""));
    }
}
