/**
 * SelectionSort
 */
public class SelectionSort {

    public static void SelectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPost=i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[j]<arr[minPost]){
                 minPost=j;
            }
        }
        //swap
        int temp= arr[i];
        arr[i]=arr[minPost];
        arr[minPost]=temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        SelectionSort(arr);
        printArr(arr);
    }
}