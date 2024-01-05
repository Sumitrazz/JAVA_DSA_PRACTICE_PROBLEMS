public class Tiling_problem {
    public static int tilingProblem(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //vertical choise
        int fnm1=tilingProblem(n-1);
        //horizontal choise
        int fnm2=tilingProblem(n-2);
        int totways=fnm1+fnm2;
        return totways;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(5));
    }
}
