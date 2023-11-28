import java.util.Arrays;
import java.util.Collections;
public class Insertion_Sort {
   
    public static void printArr(Integer arr[]){
        for(Integer i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        } System.out.println();
    }
    public static void insertionSort(Integer arr[]){
        for(Integer i=1; i<arr.length; i++){
            Integer curr= i;
            Integer per= i-1;
            while(per>=0 && arr[per]>arr[curr]){
                arr[per+1]= arr[per];
                per--;
            }
             arr[per+1]=arr[curr];
        }
       
    }   
    public static void main(String args[]){
        Integer arr[]= { 52,43,10,3,2};
       Arrays.sort(arr, Collections.reverseOrder());
//insertionSort(arr); 
        printArr(arr);
    }
}
 