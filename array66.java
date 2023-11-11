/**
 * array66
 */
public class array66 {

    public static void reverse(int number[]){
        int first=0;
        int last=number.length-1;
        while(first<=last){
            //swap
            int tamp=number[last];
            number[last]=number[first];
            number[first]=tamp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int number[]={2,3,4,5,6,7,8,9,10};
        reverse(number);
        for(int i=0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }System.out.println();
    }
}