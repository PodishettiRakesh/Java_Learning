import java.util.Random;

public class Array {
    private int[] intArray;
    private int numValues;
    private int maxValues;

    // Default constructor
    public Array() {
        this.numValues = 0;
        this.maxValues = 20;
        this.intArray = new int[maxValues];
    }

    // Constructor with an array parameter to remove duplicates
    public Array(int[] arr) {
        this.intArray = new int[20];
        this.numValues = 0;
        this.maxValues = 20;
        for (int i = 0; i < arr.length; i++) {
            int repeated = 0;
            for (int j = 0; j < numValues; j++) {
                if (arr[i] == intArray[j]) {
                    repeated += 1;
                }
            }
            if (repeated == 0 && numValues < maxValues) {
                intArray[numValues++] = arr[i];
            }
        }
    }

    // Constructor to generate random numbers within a specified range
    public Array(int numRandom, int low, int high) {
        this.intArray = new int[20]; 
        this.numValues = 0; 
        this.maxValues = 20; 

        if (numRandom >= 1 && low <= high) {
            Random ran = new Random();
            int count = 0;
            while (count < numRandom && numValues < maxValues) {
                int ele = ran.nextInt(high - low + 1) + low; 
                intArray[numValues++] = ele;
                count++;
            }
        } else {
            System.out.println("Invalid input parameters."); 
        }
    }

    public void printArray() {
        for (int i = 0; i < numValues; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Array ar = new Array();
        int[] arr = {1, 2, 3, 4, 2, 3, 5, 6, 7, 9, 1};
        Array myArray = new Array(arr);
        myArray.printArray();

        Array ranArray = new Array(12, 2, 9); 
        ranArray.printArray(); 
    }
}
