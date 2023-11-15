public class array71 {
  public static void maxSubArraySum(int number[]){
    int currSum=0;
    int maxSum=Integer.MIN_VALUE;
    int prefix[]=new int[number.length];
    prefix[0]=number[0];
    for(int i=1; i<prefix.length; i++){
        prefix[i]=prefix[i+1]+number[i];
    }

    
    // System.out.println("maxSum="+maxSum);
  }
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        maxSubArraySum(number);
    }
}
