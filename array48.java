public class array48 {

    public static void Bintodec(int binNum){
        int myNum=binNum;
        int pow=0;
        int decNum=0;
         while(binNum>0){
            int lastDist=binNum%10;
            decNum+=(lastDist*(int)Math.pow(2, pow));
            pow++;
            binNum=binNum/10;
         }
         System.out.println("decimal of"+myNum+"="+decNum);
    }
    public static void main(String[] args) {
        Bintodec(1101);
    }
}