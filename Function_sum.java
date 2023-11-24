import java.util.*;


public class Function_sum {
   public static void calsum(){
   System.out.println("Enter your a and b number :");
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    int sum = a+b;
    System.out.println("sum is : "+ sum);
   }
    

public static void main(String args[]){
calsum();
}

}
