public class Array{
    private int[] intArray;
    private int numValues;
    private int maxValues;

    public Array(){
        this.numValues=0;
        this.maxValues=20;
        this.intArray= new int[maxValues]; 
    }

    public int[] MyArray(int[] arr){
        int[] array=new int[20];
        return array;
    }

    public static void main(String[] args) {
        Array ar = new Array();
        int[] arr= {1,2,1,3,4,4,5,6,7};
        System.out.println(ar.MyArray(arr));

    }
}