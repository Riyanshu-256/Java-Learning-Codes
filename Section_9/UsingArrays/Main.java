package Section_9.UsingArrays;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);  // to generate random array
        System.out.println(Arrays.toString(firstArray));  // sort the elements of array in ascending order
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        // create and fill an array with the same value
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        // copy an array
        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        // sort the copied array & compare
        int [] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        // create smaller copies
        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));
        
        // create larger copies
        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));
        
        // string array sorting & searching
        String [] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Mark in the list");
        }
        
        // compare two arrays
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {5,2,3,4,1};

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are not equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
            
        }

    // helper method
    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];

        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
            
        }
        return newInt;
     
}    

}
