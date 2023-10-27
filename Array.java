import java.util.*;
public class Array {
    public static void main(String args[]){
        int mark[]= new int [100];
Scanner sc=new Scanner(System.in);
System.out.println("Enter phy Mark");
mark[0]=sc.nextInt(); // phy
System.out.println("Enter che Mark");

mark[1]=sc.nextInt(); //chem
System.out.println("Enter math Mark");

mark[2]=sc.nextInt(); // math
System.out.println("phy:"+mark[0]);
System.out.println("che:"+mark[1]);
System.out.println("math:"+mark[2]);
int percentage=(mark[0]+mark[1]+mark[2])/3;
System.out.println("percetage"+percentage+"%");
    }

    public static void sort(int[] arr, int i, int j) {
    }
}
