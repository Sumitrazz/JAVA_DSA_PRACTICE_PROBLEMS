import java.util.*;

public class if_elsse_statement {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
       System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if(age>=18){
        System.out.println("adult: drive , vote");
        }
       /*  if(age>13 && age <18){
            System.out.println("teenager");
        } 
       */
       else{
            System.out.println("not adult");
        }
    }
    
}
