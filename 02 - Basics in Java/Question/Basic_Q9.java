// How do you take a character as input in java using Scanner?

import java.util.Scanner;
public class Basic_Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.print("Enter the letter ");
    char ch = sc.next().charAt(0);
    System.out.println("You entered: " + ch);
    sc.close();

    
    
    }
}
 