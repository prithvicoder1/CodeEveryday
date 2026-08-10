import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
    /*
    Syntax of for loops;
    for (initialisation; condition, increment/ decremnet){
       // body
    } 
     */

    // q: Print number from 1 to 3
   //  for (int num = 1; num <=5; num+= 1){
   //      System.out.println(num);
   //  }

   Scanner in = new Scanner(System.in);
 //    int n = in.nextInt();

//   for (int num = 1; num <= n; num++){
 //      System.out.println(num + " ");
//   }


/*
While Loop

Syntax:
while(condition){
//body
}
 */

//  int num = 1;
//  while(num <= 5){
//      System.out.println(num);
//      num += 1;
//  }







/*

// do while

Syntax:
do{
//body
} while(condition);
 */


int n = 1;

do {
    System.out.println("Hello World");
    n++;
} while (n != 1);
}
}