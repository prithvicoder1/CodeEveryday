// Input currency in rupees and output in USD
import java.util.Scanner;
public class V8_Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount in Rupees: ");
        double rupees = input.nextDouble();

        double rate = 83.0; // 1 USD = 83 INR (approx)
        double usd = rupees / rate;

        System.out.println(rupees + " INR = " + usd + " USD");
    }
}