/**
 * array72
 */
public class array72 {
public static void bubblesort(int arr[]){

    for(int i=0; i<arr.length-1; i++){
        for(int j=0; j<arr.length-1-i; j++){
            if(arr[j]>arr[j+1]){
                //swap
                int tamp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=tamp;
            }
        }
    }
}
public static void printArr(int arr[]){
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }System.out.println();
}
    public static void main(String[] args) {
 int arr[]={2,33,12,3,1,243};
 System.out.println(arr.length);
 bubblesort(arr);
 printArr(arr);       
    }
}