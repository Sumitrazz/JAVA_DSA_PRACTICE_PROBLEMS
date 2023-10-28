//reverse number of a digit
public class Array24 {
    public static void main(String[] args) {
        int n=23456;
        while(n>0){
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;
        }System.out.println();
    }
}
