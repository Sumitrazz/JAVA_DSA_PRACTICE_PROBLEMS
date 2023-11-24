public class function_overloading {
    public static int sum(int a, int b){
        return a+b;
    } public static int sum(int a, int b, int c){
        return a+b+c;
    } public static void main(String args []){
        sum(3,5);
        sum(3,4,3);
        System.out.println(sum(3,5));
        System.out.println(sum(3,4,3));
    }
}
