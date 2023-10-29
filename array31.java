import java.util.*;
/**
 * array31
 */
public class array31 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if(n==2){
            System.out.println("its prime");
        }else{
            boolean isPrime= true;
            for(int i=2; i<n; i++){
                if(n%i==0){
                    isPrime =false;
                }
            }
            if(isPrime==true){
                System.out.println("its prime number");
            }else{
                System.out.println("Not a prime number");
            }
        }
    }
}