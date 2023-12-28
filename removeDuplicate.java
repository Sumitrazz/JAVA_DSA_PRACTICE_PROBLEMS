public class removeDuplicate {
    public static void remove_Duplicate(String str, int idx,StringBuilder newStr, boolean map[]){
      if(idx==str.length()){
        System.out.println(newStr);
        return;
      }
       char currChar=str.charAt(idx);
       if(map[currChar-'a']==true){
        //duplicate
        remove_Duplicate(str, idx+1, newStr, map);
       }else{
        map[currChar-'a']=true;
        remove_Duplicate(str, idx+1, newStr.append(currChar), map);
       }
    }
    public static void main(String[] args) {
        String str="apnnacollege";
 remove_Duplicate(str,0,new StringBuilder(""),new boolean[26]);
    }
}
