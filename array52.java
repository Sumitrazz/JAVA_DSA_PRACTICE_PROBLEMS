public class array52 {
    public static void inverted_half(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_half(5);
    }
}
