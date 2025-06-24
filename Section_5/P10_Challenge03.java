package Section_5;

import java.util.Scanner;

public class P10_Challenge03 {

     public static void printMegaBytesAndKiloBytes(int kiloBytes) {
          if (kiloBytes < 0) {
               System.out.println("Invalid Value");
          } else {
               System.out.print(kiloBytes + " KB = ");
               int megabytes = kiloBytes/1000;
               kiloBytes -= (megabytes*1000);
               System.out.println(megabytes + " MB and " + kiloBytes + " KB");
          }
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Please enter the total in KB: ");
          int kb = sc.nextInt();
          printMegaBytesAndKiloBytes(kb);
          sc.close();
     }
}
