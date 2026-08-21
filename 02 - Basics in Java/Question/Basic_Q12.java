
import java.util.Scanner;
public class Basic_Q12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the roll number ");
    int rollno = input.nextInt();
    System.out.println("Your roll num is " + rollno);

    System.out.print("Enter your name ");
    String name = input.nextLine();
    
    System.out.println("Your name is " + name);
    input.close();
  }  
}
