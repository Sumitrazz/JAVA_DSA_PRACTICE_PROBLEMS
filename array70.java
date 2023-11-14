import java.util.*;
/**
 * array70
 */
public class array70 {
public static int reverse(int x){

    while(x>0){
    int last=x%10;
    System.out.print(last);
    x=x/10;
    }
    System.out.println();
    return x;
}
    public static void main(String[] args) {
    int x=345;
     reverse(x);        
    }
}
