package Section_5;

public class P16_Method_Overloading {
    public static void main(String[] args) {

          // Using the first method we created above
          System.out.println("New score is " + calculateScore("abc", 500));

          // Using the second method we created with different parameters -> method overloading
          System.out.println("New Score for the unnamed player is " + calculateScore(200));

          // Using the third method we created with different parameters -> method overloading
          System.out.println("New Score for the unnamed player is " + calculateScore(200));
     }

     // Creating a new method 
     public static int calculateScore(String playerName, int score) {
          System.out.println("\nPlayer " + playerName + " scored " + score + " points");
          return score * 1000;
     }

     // Again creating a new method with same name -> method overloading
     public static int calculateScore(int score) {
          System.out.println("\nUnnamed player scored " + score + " points");
          return score * 1000;
     }

     // Again creating a new method with same name -> method overloading
     public static int calculateScore() {
          System.out.println("\nNo player name, no player score");
          return 0;
     }
}
