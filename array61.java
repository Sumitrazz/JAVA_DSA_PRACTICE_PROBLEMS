public class array61 {

    public static void pattren(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
// space
for(int j=1; j<=2*(n-i); j++){
    System.out.print(" ");
}
//star-1
for(int j=1; j<=i; j++){
    System.out.print("*");
}
System.out.println();
//and 2nd half


        }
       for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=1; j<=2*(n-i); j++ ){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
    public static void main(String[] args) {
        int n=10;
        pattren(n);
    }
}