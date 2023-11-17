import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
public class array80 {
    public static void printArr(Integer arr[]){
        for(Integer i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
   public static void main(String[] args) {
    Integer arr[]={6,5,4,3,8,7,0,1};
    Arrays.sort(arr, 0, 4,Collections.reverseOrder());
    printArr(arr);

}


}

