import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 56, 87, 23, 45, 65);

        multiple(10, 20, "Richa", "Prithvi", "Java");
    }

    static void multiple(int a, int b, String... v) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(Arrays.toString(v));
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}