public class binarytoDisimal {
   public static void bintoDic(int binNUM){
    int myNum=binNUM;
    int pow=0;
    int decNum=0;
    while(binNUM>0){
        int lastDigit=binNUM%10;
        System.out.println(lastDigit);
        decNum =decNum+(lastDigit*(int)Math.pow(2, pow));
        pow++;
        binNUM=binNUM/10;
    }
    System.out.println("decimal of"+myNum+"="+decNum);
   }
    public static void main(String[] args) {
        bintoDic(11001001);
    }
}
