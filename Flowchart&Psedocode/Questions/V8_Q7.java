// to calculate Fibonaacci Serires up to n number
import java.util.Scanner;
public class V8_Q7 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    System.out.print("Enter the number of term :");
    int n  = input.nextInt();

    int  a = 0, b = 1;

    System.out.print("fibonacci Series: ");
    for (int i = 1; i <=n; i++){
        System.out.println(a + " ");
        int next = a + b;
        a = b;
        b = next;
    }
   } 
}
