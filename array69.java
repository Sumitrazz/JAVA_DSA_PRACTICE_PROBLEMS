public class array69 {

    public static void maxSubArraySum(int number[]){
        int currSum=0;
        int  maxSum=Integer.MIN_VALUE;
        for(int i=0; i<1; i++){
            for(int j=i; j<number.length; j++){
                 currSum=0;
                for(int k=i; k<=j; k++){
                    // subArraysum
                currSum+=number[k];
                }System.out.println(currSum);
             
                if(maxSum<currSum){
                    maxSum=currSum;
                 }
            }
        }
         System.out.println("max sum ="+maxSum);
    }
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        maxSubArraySum(number);
    }
}