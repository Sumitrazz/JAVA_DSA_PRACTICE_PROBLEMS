import java.util.*;
public class while_loop6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
    //     int sum =0;

    //    for(int i=1; i<=n; i++){
    //     sum +=i;
    //     System.out.println(sum);
    //    }
    int sum =0;
    int i=1;
    while(i<=n){
        sum +=i;
        i++;
        System.out.println(sum);
    }
    }
}
