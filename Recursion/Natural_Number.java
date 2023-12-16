public class Natural_Number {
    public static int calcSum(int n){
    if(n==1){
        return 1;
    }
    int sum=calcSum(n-1);
    int sn=n+sum;
    return sn;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(calcSum(n));
    }
}
