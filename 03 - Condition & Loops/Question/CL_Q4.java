// Area of isosceles Triangle

package Conditionals_loops_Question;
import java.util.Scanner;
public class CL_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter base of the isosceles triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter lenght of the equal side: ");
        double side = sc.nextDouble();

        double a = side;
        double b = side;
        double c = side;

        if(a + b <= c || a + c <= b || b + c <= a){
            System.out.println("Invalid trinagle sides. ");

        } else {
            double s = (a + b + c) / 2; 
            double area = Math.sqrt(s*(s - a)*(s - b)* (s - c));
            System.out.println("Area of the isosceles traingle: " + area);
        }
    }
}
