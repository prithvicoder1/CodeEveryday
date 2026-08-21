// How to read a doble value form console input
import java.util.Scanner;
public class Basic_Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.print("Enter the First Number ");
        double num1 = input.nextDouble();

        System.out.print("Enter the Second Number ");
        double num2 = input.nextDouble();

        double sum  = num1 + num2;
        System.out.println("Sum = " + sum);

    }
}
