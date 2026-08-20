// Fibonnacci Series in the java program

package Conditionals_loops_Question;
import java.util.Scanner;
public class CL_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter teh maxium value for the Fibonacci Series: ");
        int limit = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        while (a <= limit){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;


        }
        sc.close();
    }
}
