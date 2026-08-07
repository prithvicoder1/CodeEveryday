// Take 2 number as input and print the largest number.
import java.util.Scanner;
public class V8_Q5 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

System.out.print("Enter first Number: ");
double a = input.nextDouble();

System.out.print("Enter Second Number: ");
double b = input.nextDouble();

if ( a > b){
    System.out.println("Largest number is : " + a);

} else if (b > a){
    System.out.println("Largest number is : " + b);
} else {
    System.out.println("Both number are equal: " + a);
}


   } 
}
