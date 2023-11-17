import java.util.Arrays;
/**
 * array79
 */
public class array79 {
    public static void printlArr(Integer arr[]){
        for(Integer i=0; i<arr.length; i++){
                System.out.print(arr[i]+" "); 
        }System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[]={8,7,5,3,2,9,1};
        Arrays.sort(arr,0,5);
        printlArr(arr);
    }
}