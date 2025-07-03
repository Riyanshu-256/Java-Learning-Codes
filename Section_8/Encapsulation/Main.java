package Section_8.Encapsulation;

public class Main {
    
    public static void main(String[] args) {
        // player player = new player();
        // player.fullName = "Tim";
        // player.health = 20;
        // player.weapon = "Sword";

        // int damage = 10;
        // player.loseHealth(damage);
        // System.out.println("Remaining health = " + player.healthRemaining());
        // player.health = 200;
        // player.loseHealth(11);
        // System.out.println("Remaining health = " + player.healthRemaining());

        Enhanced_Player tim = new Enhanced_Player("Tim", 200,"Sword");
        System.out.println("Intial health is " + tim.healthRemaining());
    }
}
