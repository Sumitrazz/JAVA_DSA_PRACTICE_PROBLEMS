public class array76 {
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    //swap
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void printlArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,1,4,7,3,5};
        selectionSort(arr);
        printlArr(arr);
    }
}
