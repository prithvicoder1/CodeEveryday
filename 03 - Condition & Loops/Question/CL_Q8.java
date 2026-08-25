// write a program to check if a number is even or odd using if- else.
import java.util.Scanner;
public class CL_Q8 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = in.nextInt();
    if(n % 2 == 0){
        System.out.println("Even Number");
    } else{
        System.out.println("Odd Number");
    }
    }
}
