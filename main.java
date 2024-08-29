public class main {
    public static void main(String[] args) {
        // String str="Rakesh";
        // String str1="rakesh";
        // System.out.println(str.substring(3));
        // System.out.println(str.substring(0,3));
        // System.out.println(Character.compare(str.charAt(0), str1.charAt(0)));

        // String str= "1234";
        // int num=Integer.parseInt(str);
        // System.out.println(num*2);

        // int num=1234;
        // String str= String.valueOf(num);
        // str=str.concat(str);
        // num=Integer.parseInt(str);
        // System.out.println(num*2);


        int num=98765;
        String str=String.valueOf(num);
        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
    
}