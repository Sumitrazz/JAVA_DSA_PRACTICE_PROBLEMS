/**
 * find_last_occurence
 */
public class find_last_occurence {
public static int lastOcc(int arr[], int key, int i){
    if(i==arr.length){
        return -1;

    }
    int isFound=lastOcc(arr, key, i+1);
    if(isFound==-1 && arr[i]==key){
        return i;
    }return isFound;
}
     public static void main(String[] args) {
        int arr[]={2,8,4,5,6,7,8,9};
        System.out.println(lastOcc(arr, 8, 0));
     }
}