public class Butterfly_pattern {
    public static void butterfly(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; i<=i; j++){
                System.out.print("*");
            } for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            } for(int j=1; j<=i; j++){
                System.out.println("*");
            } System.out.println();
        } for(int i=n; i>=i; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            } for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            } for(int j=1; j<=i; j++){
                System.out.println("*");
            } System.out.println();
        }
    } public static void main(String args[]){
        butterfly(4);
    }
}
