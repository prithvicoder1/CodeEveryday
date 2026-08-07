// To find Armstrong Number between two given numbers
import java.util.Scanner;
public class V8_Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = input.nextInt();

        System.out.print("Enter end number: ");
        int end = input.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            int digits = String.valueOf(num).length();
            int sum = 0;
            int temp = num;

            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}