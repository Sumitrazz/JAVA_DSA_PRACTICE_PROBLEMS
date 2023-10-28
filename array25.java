// using formula
public class array25 {
    public static void main(String[] args) {
        int n=10894;
        int rew=0;
        while(n>0){
            int lastdigit=n%10;
            rew=(rew*10)+lastdigit;
            //0= (0*10)+4
            // 4
            n=n/10;
        }System.out.println(rew);

    }
}
