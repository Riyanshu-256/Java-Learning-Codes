package Section_8.Polymorphism.Car;

public class Mitsubishi extends Car {
     public Mitsubishi(int cylinders, String name) {
          super(cylinders, name);
     }

     @Override
     public String startEngine() {
          return "Mitsubishi start";
     }

     @Override
     public String accelerate() {
          return "Mitsubishi faster";
     }

     @Override
     public String brake() {
          return "Mitsubishi stop";
     }
}
