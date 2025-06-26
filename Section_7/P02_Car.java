package Section_7;

public class P02_Car {
    
    public static void main(String[] args) {

        P01_Car car = new P01_Car();
        car.setMake("Porsche");  // to update the value of make
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("hotpink");
        

        System.out.println("make = " + car.grtMake());
        System.out.println("model = " + car.grtModel());
        System.out.println("color = " + car.grtColor());
        car.describeCar();

        P01_Car targa = new P01_Car();
        targa.setMake("Porsche"); 
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("hotpink");
        targa.describeCar();
    }
}
