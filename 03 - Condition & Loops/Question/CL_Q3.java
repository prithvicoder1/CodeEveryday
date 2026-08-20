// Perimeter of Rectangle


package Conditionals_loops_Question;
import java.util.Scanner;

public class CL_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();

        double perimeter = 2 * (length + breadth);

        System.out.println("Perimeter of rectangle = " + perimeter);

        sc.close();
    }
}