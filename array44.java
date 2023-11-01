public class array44 {
   public static boolean primeNum(double n){
    if(n==2){
        return true;
    }
    for(int i=2; i<=n-1; i++){
        if(n%i==0){
            return false;
        }
    }
    return true;

   } 
    public static void main(String[] args) {
        System.out.println(primeNum(18 ));
    }
}
