import java.util.Random;

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

    
    public Array(int numRandom, int low, int high) {
        this.intArray = new int[20]; 
        this.numValues = 0; 
        this.maxValues = 20; 

        if (numRandom > 0 && low <= high) {
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

    public boolean isEmpty(){
        return numValues==0;
    }

    public boolean isDecreasing(){
        for(int i=0;i<numValues-1;i++){
            if(intArray[i]<=intArray[i+1]){
                return false;
            }
        }
        return true;
    }

    public int maximum(){
        int maxi=intArray[0];
        for(int i=0;i<numValues;i++){
            if(intArray[i]>=maxi){
                maxi=intArray[i];
            }
        }
        return maxi;
    }

    public void insertfront(int num){
        // if(this.numValues < maxValues){
        //     int ele=num;
        //     for(int i=0;i<numValues;i++){
        //         intArray[i]=ele;
        //         ele=intArray[i];
        //     }
        // }

        if(this.numValues<maxValues){
            for(int i=numValues;i>0;i--){
                intArray[i]=intArray[i-1];
            }
            intArray[0]=num;
        }
    }

    public void rotateRight(){
        int last=intArray[numValues-1];
        for(int i=numValues-1;i>0;i--){
            intArray[i]=intArray[i-1];
        }
        intArray[0]=last;
    }

    public void rotateleft(){
        int first=intArray[0];
        for(int i=0;i<numValues-1;i++){
            intArray[i]=intArray[i+1];
        }
        intArray[numValues-1]=first;
    }

    // public void reverse(){
    //     int mid=intArray.length;
    //     for(int i=0;i<=mid;i++){

    //     }
    // }

    public boolean isFull(){
        return numValues==maxValues;
    }

    public void enlarge(){
        if(numValues==maxValues){
            maxValues=maxValues*2;
            int[] newArray=new int[maxValues];
            for(int i=0;i<numValues;i++){
                newArray[i]=intArray[i];
            }
            intArray=newArray;
        }
    }


    public static void main(String[] args) {
        Array ar = new Array();
        int[] arr = {99,7,6,4,3,1,1};
        Array myArray = new Array(arr);
        myArray.printArray();

        // Array ranArray = new Array(12, 2, 9); 
        // ranArray.printArray(); 
        // System.out.println(ar.isEmpty());
        // System.out.println(myArray.isDecreasing());
        // System.out.println(ranArray.maximum());
        // System.out.println(myArray.maximum());

        // myArray.insertfront(789);
        myArray.rotateRight();
        myArray.printArray();
        myArray.rotateleft();
        myArray.printArray();
        System.out.println(myArray.isFull());

    }
    
}
