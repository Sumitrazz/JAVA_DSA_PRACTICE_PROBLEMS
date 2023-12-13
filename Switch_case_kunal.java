import java.util.*;
public class Switch_case_kunal {
    public static void main(String args[]){
System.out.println("Enter the fruit name");
Scanner sc = new Scanner(System.in);
String fruit =sc.next();
switch (fruit) {
    case "Mango": System.out.println("king of fruits");
        
        break;
       
        case "Apple": System.out.println("Sweet red fruit");
        
        break;
        case "Orange": System.out.println("Round fruit");
        
        break;
        case "Grapes": System.out.println("smaller fruits");
        
        break;
      
    default:System.out.println("Please enter a valid fruit");
        break;
}
    }
}
