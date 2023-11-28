import java.util.*;
public class Income_tax_cal_using_if_else {
public static void main(String[] args){
 System.out.println("Enter Your Monthly Income");
 /*
 income < 5L = 0% tax.
 income brtween 5-10L = 20% tax.
 income >10L = 30 % tax.
 */   
Scanner sc =  new Scanner(System.in);
int inc = sc.nextInt();
if(inc<500000){
    System.out.println("No any Tax!");
} else if(inc>=50000 && inc<1000000){
    System.out.println("Yes you have to Pay Tax! = "+ inc* 0.2);
    System.out.println("And you Get amount After Tax!" + (inc -(inc* 0.2)));
} else{
System.out.println("Yes you have to pay Tax! = "+ inc* 0.3);
System.out.println("After Tax you get The Amount ="+ (inc-(inc* 0.3)));

}
}    
}
