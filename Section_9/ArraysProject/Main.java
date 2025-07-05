package Section_9.ArraysProject;

public class Main {
    public static void main(String[] args) {
        
        int[] myIntArray = new int[10];    // to create array of type of data int
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];   // to create another array of type of data double
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};   // new integer array
        System.out.println("first = " + firstTen[5]);   // assign the value of that index
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);

        // for loop
        int[] newArray;
        newArray = new int[] {5, 4, 3, 2, 1};
        for(int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i] + " ");
        }
    }
}
