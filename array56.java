public class array56 {
    public static void solidPatten(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        solidPatten(5);
    }
}
