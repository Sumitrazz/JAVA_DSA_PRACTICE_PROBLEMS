/**
 * array47
 */
public class array47 {

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public static void printInrange(int n){
        for(int i=1; i<=n; i++){
            if(isPrime(i)){// true
            System.out.print(i+"   ");
            }
        }System.out.println();
    }
    public static void main(String[] args) {
        System.out.println(isPrime(1223));
        printInrange(123);
    }
}