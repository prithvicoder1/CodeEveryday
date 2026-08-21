// why does calling nexrInt() followed by nextline() often cause a bug? How to fix it ?


import java.util.Scanner;
public class Basic_Q11 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your roll number ");
    int rollno = input.nextInt();
    System.out.println("your roll number is" + rollno);


    System.out.print("Enter your name: ");
    String name = input.nextLine();

    System.out.println("Your name is " + name);

    input.close();

   } 
}
