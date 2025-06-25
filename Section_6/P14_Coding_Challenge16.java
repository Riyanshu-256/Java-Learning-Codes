/*
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false. 
Check the tips below for more info about palindromes.
*/
package Section_6;

public class P14_Coding_Challenge16 {

     public static boolean isPalindrome(int number) {
          int originalNumber = number;
          int reversed = 0;

          number = Math.abs(number);
          while (number > 0) {
               int lastDigit = number % 10;
               reversed = reversed * 10 + lastDigit;
               number /= 10;
          }
          return Math.abs(originalNumber) == reversed;
     }
     public static void main(String[] args) {
          System.out.println(isPalindrome(121));
          System.out.println(isPalindrome(-121));
          System.out.println(isPalindrome(123));
     }
}

