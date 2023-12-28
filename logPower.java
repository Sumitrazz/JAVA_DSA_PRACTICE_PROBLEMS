/**
 * firstOccrence
 */
public class logPower {

    public static int optimizedPower(int a, int n){
        if(n==0){
            return 1;
        }
        int halfPower=optimizedPower(a, n/2);
        int halfPowerSQ=halfPower*halfPower;
        //n is odd
        if(n%2!=0){
            halfPowerSQ=a*halfPowerSQ;
        }
        return  halfPowerSQ;
    }
    public static void main(String[] args) {
        int a=2;
        int n=5;
        System.out.println(optimizedPower(a, n));
    }
}