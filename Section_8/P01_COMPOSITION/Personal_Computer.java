// package Section_8.P01_COMPOSITION;

// public class Personal_Computer extends Product {

//     private ComputerCase computerCase;
//     private Monitor monitor;
//     private Motherboard motherboard;

//     public Personal_Computer(String model, String manufacturer,

//         ComputerCase computerCase, Monitor monitor,
//         Motherboard motherboard) {
//         super(model, manufacturer);
//         this.computerCase = computerCase;
//         this.monitor = monitor;
//         this.motherboard = motherboard;
//     }

//     private void drawLogo() {
//         monitor.drawPixelAt(1200, 50, "yellow");
//     }

//     public void powerUp() {
//         computerCase.pressPowerButton();
//         drawLogo();
//     }

// //    public ComputerCase getComputerCase() {
// //        return computerCase;
// //    }
// //
// //    public Monitor getMonitor() {
// //        return monitor;
// //    }
// //
// //    public Motherboard getMotherboard() {
// //        return motherboard;
// //    }
// }

