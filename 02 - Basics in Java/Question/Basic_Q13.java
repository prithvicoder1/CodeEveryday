// Write a code a read an array of n integers on a single line separated by spaces.


import java.util.Scanner;

public class Basic_Q13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers separated by spaces:");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Array elements:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        input.close();
    }
}
