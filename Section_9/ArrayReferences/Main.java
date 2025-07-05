package Section_9.ArrayReferences;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        int[] myIntArray = new int[5];  // create a array
        int[] anotherArray = myIntArray;  // create another array of same size

        // return default value(0) bcoz of not assign value
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;  // modify the array
        modifyArray(myIntArray);

        // print after modification
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {  // call to the method

        array[1] = 2;
    }
}
