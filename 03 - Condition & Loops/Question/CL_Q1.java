// Area of Circle Java Program

package Conditionals_loops_Question;
import java.util.Scanner;
public class CL_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.printf("The area of the circle with radius %.2f is %.2fn", radius, area);
        sc.close();
    }}
