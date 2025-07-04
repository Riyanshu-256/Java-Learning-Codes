package Section_8.Master_Challenge;

public class Delux_Burger extends Burger {

    item deluxe1;
    item deluxe2;

    public Delux_Burger(String name, double price) {
        super(name, price);
    }

    public void addToppings(String extra1, String extra2, String extra3,
                            String extra4, String extra5) {
        super.addToppings(extra1, extra2, extra3);
        deluxe1 = new item("TOPPING", extra4, 0);
        deluxe2 = new item("TOPPING", extra5, 0);
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if (deluxe1 != null) {
            deluxe1.printItem();
        }
        if (deluxe2 != null) {
            deluxe2.printItem();
        }
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }
}

