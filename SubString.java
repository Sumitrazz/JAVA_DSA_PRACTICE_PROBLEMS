public class SubString {
    public static String subSttsring(String str, int si, int ei){
        String subStr=" ";
        for(int i=si; i<ei; i++){
            subStr +=str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String str="Helloworld";
        System.out.println(subSttsring(str, 0, 3));
        //System.out.println(str.substring(2, 4));
    }
}
