//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class V8_Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     System.out.print("Enter Principal: ");
     double p = input.nextDouble();

     System.out.print("Enter Time (In Years): ");
     double t = input.nextDouble();

     System.out.print("Enter Rate of Interest: ");
     double r = input.nextDouble();

     double si = (p* t * r) / 100;

     System.out.println("Simple Intrest = " + si);
    }
}
