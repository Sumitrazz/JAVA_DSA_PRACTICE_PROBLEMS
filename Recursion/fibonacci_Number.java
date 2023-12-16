public class fibonacci_Number {
 public static int fib(int n){
    if(n==0|| n==1){
        return n;
    }
    int fnm1=fib(n-1);
    int fnm2=fib(n-2);
    return fnm1+fnm2;
 }
    public static void main(String[] args) {
    int n=45;
    System.out.println(fib(n));
 }   
}