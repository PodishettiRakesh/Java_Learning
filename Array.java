import java.util.Arrays;

public class Array {
    private int[] intArray;
    private int numValues;
    private int maxValues;

   
    public Array() {
        this.numValues = 0;
        this.maxValues = 20;
        this.intArray = new int[maxValues];
    }

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
    }
}
