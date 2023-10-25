public class maxSubArraySum {
    public static void  maxSubArraysum(int number[]){
   int currSum=0;
   int maxSum=Integer.MIN_VALUE;
   for(int i=0; i<number.length; i++){
    int start=i;
    for(int j=i; i<number.length; j++){
       int  end=j;
        for(int k=start; k<=end; k++){
//subArray sum
currSum +=number[k];
        }
        System.out.println(currSum);
        if(maxSum<currSum){
            maxSum=currSum;
        }
    }
   }
   System.out.println("Max sum="+maxSum);
    }
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        maxSubArraysum(number);
    }
}
