// write code to find the largest of two numbers using if-else.
import java.util.Scanner;

public class CL_Q13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int A = input.nextInt();

        System.out.print("Enter second number: ");
        int B = input.nextInt();

        if (A >= B) {
            System.out.println("A is the largest: " + A);
        } else {
            System.out.println("B is the largest: " + B);
        }

        input.close();
    }
}