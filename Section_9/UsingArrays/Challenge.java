package Section_9.UsingArrays;

import java.util.Arrays;
import java.util.Random;

public class Challenge {

    public static void main(String[] args) {

        int[] unsortedArray = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));

        // sort the elements of array in descending order
        int[] sortedArray = sortIntegers(new int [] {5,72,40});
        System.out.println(Arrays.toString(sortedArray));
    }

    // getRandomArray(int len) method
    public static int [] getRandomArray(int len) {
        Random random = new Random();
        int [] randomArray = new int[len];
        for (int i = 0; i <len; i++) {
            randomArray[i] = random.nextInt(1000) ;       
        }
        return randomArray;
    }
    private static int[] sortIntegers(int[] array){
        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {

            if (sortedArray[i] < sortedArray[i+1]) {
                temp = sortedArray[i];
                sortedArray[i] = sortedArray[i+1];
                sortedArray[i+1] = temp;
                flag = true;
                System.out.println("-------->" + Arrays.toString(sortedArray));
            }
                
            }
            System.out.println("----->" + Arrays.toString(sortedArray));
        }

        return sortedArray;
    }
    
}
