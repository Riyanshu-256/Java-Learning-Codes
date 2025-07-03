package Section_8.P01_COMPOSITION;

public class Main {
   public static void main(String[] args) {
        
           // Create an object of type computer case
   ComputerCase theCase = new ComputerCase("2208", "Dell",
                "240");

        // Create an object of type monitor case
        Monitor theMonitor = new Monitor("27inch Beast", "Acer",
                27, "2540 x 1440");

        // Create an object of type motherboard case
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");

        // Create an object of type personal computer case
        Personal_Computer thePC = new Personal_Computer("2208", "Dell",
                theCase, theMonitor, theMotherboard);

        // // To call the get => monitor, motherboard & computer case method
        // thePC.getMonitor().drawPixelAt(10, 10, "red");
        // thePC.getMotherboard().loadProgram("Windows OS");
        // thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
   }

}
