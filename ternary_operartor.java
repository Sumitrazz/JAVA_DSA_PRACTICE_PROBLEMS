import java.util.*;
public class ternary_operartor {
    public static void main(String args[]){
      System.out.println("Entre your marks");
      Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String report_Card = (marks>=33)?"pass":"fail";
System.out.println(report_Card);
    
    }
}
