import java.util.*;
/**
 * array64
 */
public class array64 {

    public static int getlargest(int number[]){
     int largest=Integer.MIN_VALUE;
     int smallest=Integer.MAX_VALUE;
     for(int i=0; i<number.length; i++){
        if(largest<number[i]){
            largest=number[i];
        }
        if(smallest>number[i]){
            smallest=number[i];
        }
     }
     System.out.println("Smallst number is: "+smallest);
     return largest;
    }
    public static void main(String[] args) {
        int number[]={3,53,24,22,55,};
        System.out.println("largest number is: "+getlargest(number));
    }
}