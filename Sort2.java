import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
public class Sort2 {
    public static void printArr(Integer arr[]){
        for(Integer i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[]={4,2,5,3,7,1};
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        printArr(arr);
    }
}
