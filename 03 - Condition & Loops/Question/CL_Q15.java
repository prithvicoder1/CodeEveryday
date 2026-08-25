// write a loop to print all even number between 1 to 20.
import java.util.Scanner;
public class CL_Q15 {
   public static void main(String[] args) {
    Scanner intput = new Scanner(System.in);
    for (int i = 1; i <= 20; i++) {
    if(i % 2 == 0){
        System.out.println(i);
    }
   } 
}
 }