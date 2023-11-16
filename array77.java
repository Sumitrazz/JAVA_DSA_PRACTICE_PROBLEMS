/**
 * array77
 */
public class array77 {

    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int prev=i-1;
            int curr=arr[i];
            //finding out correct pos to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    
    }
    public static void printlArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,1,4,7,3,5};
        insertionSort(arr);
        printlArr(arr);
    }
}