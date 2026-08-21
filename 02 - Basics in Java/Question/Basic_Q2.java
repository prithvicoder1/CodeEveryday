// Write code to read a single integer from used input using Scanner.

import java.util.Scanner;
public class Basic_Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = input.nextInt();

        System.out.println(num);
        input.close();
    }
}
