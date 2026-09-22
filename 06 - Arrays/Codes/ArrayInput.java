import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        // Taking input using for loop
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // Printing array elements
        System.out.println("Array elements are:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        in.close();
    }
}