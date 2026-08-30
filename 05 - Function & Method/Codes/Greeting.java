import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
//        int ans = sum2();
  //      System.out.println(ans);

          int ans = sum3(20, 30);
          System.out.println(ans);
    }
// pass the value of the number when your are calling the method in main()
     static int sum3(int a, int b){
        int sum = a + b;
        return sum;
     }
    // Return teh value
    static int sum2() {
    Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("enter number 2: ");
        int  num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
        return sum;
    }

    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("enter number 2: ");
        int  num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }
}
