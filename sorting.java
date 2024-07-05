import java.util.Arrays;
public class sorting {
    private int[] array={1,2,4,7,8,33,12,15};

    public sorting(int[] array){
        this.array=array;
    }

    public sorting(){
        this.array=array;
    }

    private int linearSearch(int[] array,int num){
        for(int i=0;i<array.length;i++){
            if(array[i]==num){
                return i;
            }
        }
        return -1;
    }

    private void selectionSort(){
        for(int i=0;i<array.length;i++){
            int minIndex=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j] < array[minIndex]){
                    minIndex=j;
                }
            }

            int temp=array[minIndex];
            array[minIndex]=array[i];
            array[i]=temp;
        }
    }


    private void printArray(){
        for(int each : array){
            System.out.print(each+" ");
        }
        System.out.println();
    }

    private int binarySearch(int[] array, int num){
        int start=0;
        int end=array.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(array[mid]==num){
                return mid;
            }else if(num < array[mid]){
                end=mid-1;
            }else if(num > array[mid]){
                start=mid+1;
            } 
        }
        return -1;
    }

    private void mergeSort(){

    }

    private void insertionSort(){
        for(int i=1;i<array.length;i++){
            int j=i-1;
            int value=array[i];

            while(j>=0 && array[j]>value){
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]=value;
        }
    }

    public static void main(String[] args) {
        // sorting obj = new sorting();
        int[] arr={1,2,3,4,5,6,7};
        sorting sorted = new sorting();
        sorted.printArray();
        // sorted.selectionSort();
        
        sorted.printArray();
    }
}
