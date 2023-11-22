import java.util.*;
public class check_prime_number {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
//         if(n==2){
//             System.out.println("N is prime");
//         }else{
//             boolen isprime =true;
// for(int i=2; i<=n-1; i++){
//     if (n%i==0){
//        boolen isprime= false;
//     } if (isprime== true){
//         System.out.println("N is prime");
//     }
// }else {
//     System.out.println("N  is not prime");
// }
//         }
int num=sc.nextInt();
int count=0;
for(int i=1; i<=num; i++){
    if(num%i==0){
count++;
    }
}if(count==2){
    System.out.println("Prime");

}else{
    System.out.println("not prime");
}






}
}
