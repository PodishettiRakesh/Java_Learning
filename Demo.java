// public class Demo{
//     public static void main(String[] args){
//         System.out.println("Hello world!");
//     }
// }

public class Demo{
    public static void main(String[] args) {
        int x=6;
        int y=8;
        int sum=x+y;
        System.out.println(sum);
    }
}

class findEven{
    public static void main(String[] args){
        int num=8;
        if(num%2==0){
            System.out.println("it is even number");
        }else{
            System.out.println("it is odd number");
        }
    }
}


class factorial{
    public static void main(String[] args) {
        int num=3;
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}