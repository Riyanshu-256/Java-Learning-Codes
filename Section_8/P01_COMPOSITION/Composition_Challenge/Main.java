package Section_8.P01_COMPOSITION.Composition_Challenge;

public class Main {
    public static void main(String[] args) {
        
        Smart_Kitchen kitchen = new Smart_Kitchen();

        // kitchen.getDishWasher().setHasWorkToDo(true);
        // kitchen.getIceBox().setHasWorkToDo(true);
        // kitchen.getBrewMaster().setHasWorkToDo(true);
        // kitchen.getDishWasher().doDishes();
        // kitchen.getIceBox().orderFood();
        // kitchen.getBrewMaster().brewCoffee();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }
}
