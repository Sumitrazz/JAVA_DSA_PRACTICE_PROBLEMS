public class printReverseOfaNumber {
    public static void main(String[] args) {
        // last digit=num%10;
        //remove last digit= num/10;
        int num=234345;
        while(num>0){
            int lastDigit=num%10;
            System.out.print(lastDigit);
           num=num/10;
        }System.out.println();
    }
    
}
