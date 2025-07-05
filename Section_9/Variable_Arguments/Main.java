package Section_9.Variable_Arguments;

public class Main {
    public static void main(String... args) {
        System.out.println("Chukundarrr Bhaiiii ");

        String[] splitStrings = "Chukundarrr Bhaiiii ".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Chukundarrr");

        System.out.println("_".repeat(20));
        printText("Chukundarrr", "Bhaiiii");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first", "seconf", "third", "fourth", "fifth"};
        System.out.println(String.join(",",  sArray));
    }

    private static void printText(String... textList) {

        for (String t : textList) {
            System.out.println(t);
        }
    }
}
