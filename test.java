import java.util.*;

import javax.sound.midi.Sequencer.SyncMode;
public class test{
  //public static void main(String args[]){
    // Scanner sc = new Scanner(System.in);
    // int n= sc.nextInt();
    // int counter=1;
    // while(counter<=n){
    //   System.out.println(counter+" ");
    //   counter++;
    // }
  //  int counter=1;
  //  while(counter<=10){
  //   System.out.println(counter);
  //   counter++;
  //  }
// ****
// ****
// ****
// ****
// for(int star=1; star<=4; star++){
//   for(int line=1; line<=4; line++){
//     System.out.print(" * ");
//   }System.out.println();
// }

// Scanner sc = new Scanner(System.in);
// int n= sc.nextInt();
// int sum=0;
// int i=1;
// while(i<=n){
//   sum+=i;
//   i++;
//   System.out.println(sum);
// }
  //}

// public static void printHelloWorld(){
//   System.out.println("Hello world");
//   System.out.println("Hello world");
// } public static void main(String args[]){
//   printHelloWorld();
// }

// public static void calcuteSum(){
//   Scanner sc= new Scanner(System.in);
//   int a= sc.nextInt();
//   int b= sc.nextInt();
//   int sum= a+b;
//   System.out.println(sum);
// } public static void main(String args[]){
//   calcuteSum();
// }
// public static void main(String args[]){
//   int a=5;
//   int b=6;
//   int temp=a;
//   a=b;
//   b=temp;
//   System.out.println(a);
//   System.out.println(b);

// }
// public static void swap(int a, int b){
//   int temp=a;
//   a=b;
//   b=temp;
//   System.out.println(a);
//   System.out.println(b);
// }public static void main(String args[]){
//   int a=5;
//   int b=10;
//   swap(a,b);

// }

// public static void multiply(int a, int b){
//   int product= a*b;
// System.out.println(product);
// }public static void main(String args[]){
//   int a=5;
//   int b= 4;
//   multiply(a, b);
// System.out.println();
// }

// public static int factorial(int n){
//   int f=1;
//   for(int i=1; i<=n; i++){
// f= f*i;

//   }return f;
// }
//  public static void main(String args[]){
// System.out.println(factorial(4));
//  }

// public static int binCoff(int n, int r){
//   int fact_n= factorial(n);
//   int fact_r= factorial(r);
//   int fact_nmr= factorial(n-r);
//   int binCoff = fact_n/(fact_r*fact_nmr);
//   return binCoff;
// } private static int factorial(int r) {
//   return 0;
// }
// public static void main(String args[]){
//   System.out.println(binCoff(5, 2));
// }

// public static int sum(int a, int b){
//   return a+b;
// }public static int sum(int a, int b, int c){
//   return a+b+c;
// } public static void main(String args[]){
//   System.out.println(sum(3, 5));
//   System.out.println(sum(5, 2, 1));
// }

// public static int sum(int a, int b){
//   return a+b;

// } public static int sum(float a, float b){
//   return (int) (a+b);
// } public static void main(String args[]){
//   System.out.println(sum(3, 05));
//   System.out.println(sum(3.2f, 4.8f));
// }
// public static boolean isPrime(int n){
//   boolean isPrime= true;
//   for(int i=2; i<=n-1; i++){
//     if(n%i==0){
//     isPrime=false;
//     break;
//   }
//   }return isPrime;
// } public static void main(String args[]){
//   isPrime(5);
// }
// public static boolean isPrime(int n){
//   if(n==2){
//     return true;
//   } for(int i=2; i<=Math.sqrt(n); i++){
//     if(n%i==0){
//       return false;
//     }
//   } return true;
// } public static void main(String args[]){
//   System.out.println(isPrime(7));
// }

// public static void binTodec(int binNum){
//   int myNum=binNum;
//   int pow=0;
//   int decNum=0;
//   while(binNum>0){
//     int lastDigit= binNum%10;
//     decNum= decNum+(lastDigit*(int)Math.pow(2, pow));
//     pow++;
//     binNum= binNum/10;

//   } System.out.println("decimal of"+ myNum+"="+decNum);

// } public static void main(String args[]){
//   binTodec(101);
// }

// public static void decTobin(int n){
//   int myNum=n;
//   int pow=0;
//   int binNum=0;
//   while(n>0){
//     int rem=n%2;
//     binNum= binNum+(rem*(int)Math.pow(10, pow));
//     pow++;
//     n=n/2;
//   } System.out.println("binary form of"+myNum+"="+binNum);
// }public static void main(String args[]){
//   decTobin(10);
// }

// public static void hollo_rectangle(int totRows, int totCols){
//   for(int i=1; i<=totRows; i++){
//     for(int j=1; j<=totCols; j++){
//       if(i==1|| i== totRows || j==1 || j==totCols){
//         System.out.print("*");
//       } else
//       {
//         System.out.print(" ");
//     }
//   }System.out.println();
//     } 
// } public static void main(String args[]){
//   hollo_rectangle(4, 5);
// }

// public static void inverted_rotated(int n){
//   for(int i=1; i<=n; i++){
//     for(int j=1; j<=n-i; j++){
//       System.out.print("");
//     } for(int j=1; j<=i; j++){
//       System.out.print("*");
//     } System.out.println();
//   }
// } public static void main(String args[]){
//   inverted_rotated(7);
// }

// public static void name(int n){
//   for(int i=1; i<=n; i++){
//     for(int j=1; j<=n-i+1; j++){
//       System.out.print(j);
//     }System.out.println();
//   }
// }public static void main(String args[]){
// name(5);
// }
// public static void floyds_triangle(int n){
//   int counter=1;
//   for(int i=1; i<=n; i++){
//     for(int  j=1; j<=i; j++){
// System.out.print(counter+" ");
// counter++;
//     }System.out.println();
//   }
// }public static void main(String args[]){
//   floyds_triangle(5);
// // }
// public static void name(int n){
//   for(int i=1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//       if((i+j)%2==0){
//         System.out.print(1);
//       }else{
//         System.out.print("0");
//       }
//     }System.out.println();
//   }
// }public static void main(String args[]){
//   name(5);
// }

}
