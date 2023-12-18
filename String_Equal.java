public class String_Equal {
    public static void main(String[] args) {
        String s1="Sumit";
        String s2="Sumit";
        String s3= new String("Sumit");
        //----> !st way
        // if(s1==s2){
        //     System.out.println("String is equal");
        // }else{
        //     System.out.println("String are not equal");
        // }

        //---> 2nd way
        // if(s1==s3){
        //     System.out.println("String are equal");
        // }else{
        //     System.out.println("String are not equal");
        // }
        //---->

       if(s1.equals(s3)){
        System.out.println("String is equal");
       }else{
        System.out.println("String are not equal");
       }
    }
}
