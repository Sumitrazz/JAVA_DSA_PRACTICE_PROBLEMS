import java.util.*;
public class array59 {
    public static void main(String[] args) {
        int  marks[]=new int [100];
        Scanner sc= new Scanner( System.in);
        marks[0]=sc.nextInt();//phy
        marks[1]=sc.nextInt(); //che
        marks[2]=sc.nextInt(); //math
        System.out.println("phy: "+marks[0]);
         System.out.println("che: "+marks[1]);
          System.out.println("math: "+marks[2]);
          int percentage=(marks[0]+marks[1]+marks[2])/3;
          int total =marks[0]+marks[1]+marks[2];
          System.out.println("total marks is: "+total);
          System.out.println("percentage : "+ percentage+"%");
    }
}
