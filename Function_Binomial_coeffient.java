public class Function_Binomial_coeffient {
    // public static void bincoeff(int n, int r){
    //     int fact_n=(n);
    //     int fact_r=(r);
    //     int fact_nmr=(n-r);
    //     int bincoeff = fact_n/ (fact_r* fact_nmr);
    //     // return bincoeff;
    //     System.out.println(bincoeff);
    // } public static void main(String args[]){
    //    bincoeff(5, 2);
       

    public static int binCoeff(int n, int r) {
        int fact_n = (n);
        int fact_r = (r);
        int fact_nmr = (n-r);
        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
        }
    
        public static void main (String args []) {
        System.out.println (binCoeff(5,2));


    }
}
