// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
public class V8_Q4 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter first number: ");
    double a = input.nextDouble();

    System.out.print("Entre Second Number");
    double b = input.nextDouble();

    System.out.print("Enter the operator( +, -, *, /): ");
    char op = input.next().charAt(0);

    double result = 0;
    if (op == '+') result = a + b;
    else if (op == '-') result = a - b;
    else if ( op == '*') result = a * b;
    else if ( op == '/') result = a / b;

   System.out.println("Result = " + result);
    }

    }

