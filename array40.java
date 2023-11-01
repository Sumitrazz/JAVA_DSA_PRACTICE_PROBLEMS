import java.util.*;
public class array40 {
    public static int fact(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter your number :");
      int n=sc.nextInt();
        System.out.println("factorial is:"+fact(n));
    }
}
