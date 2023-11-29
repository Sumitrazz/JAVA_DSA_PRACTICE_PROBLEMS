public class Largest_Number {
    // public static int getlargest(int numbers[]){
    //     int largest=Integer.MIN_VALUE;
    //     for(int i=0; i<numbers.length; i++){
    //         if(largest<numbers[i]){
    //             largest=numbers[i];
    //         }
    //     } return largest;
    // } public static void main(String args[]){
    //     int numbers[]={1,2,6,3,5};
    //     System.out.println("largest value is:"+ getlargest(numbers));
    // }


/**
 * @param numbers
 * @param key
 * @return
 */
public static int getlargest(int numbers[]){
    int largest=Integer.MIN_VALUE;
    for(int i=0; i<numbers.length; i++){
        if(largest<numbers[i]){
            largest=numbers[i];
        }
    }return largest;
}
    public static void main(String args[]){
        int numbers[]={2,4,5,3,5,7,8,};
        int key=5;
        System.out.println("largest value is :"+getlargest(numbers));
    }
}
