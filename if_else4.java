import java.util.*;
public class if_else4 {
public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int age= sc.nextInt();
    if(age>=18){
     
       System.out.println("your Adult");
    } // else if using 
    else if(age>= 13 && age<18){
        System.out.println("Teenager");
    } else{
        System.out.println("child");
    }
}    
}
