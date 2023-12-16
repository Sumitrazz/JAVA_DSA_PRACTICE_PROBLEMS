/**
 * Increasing_Order
 */
public class Increasing_Order {
public static void printdec(int n){
    if(n==1){
        System.out.println(n);
        return;
    }
    printdec(n-1);
System.out.println(n);
}
    public static void main(String[] args) {
        int n=10;
        printdec(n);
    }
}