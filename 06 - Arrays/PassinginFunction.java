import java.util.Arrays;
public class PassinginFunction {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[]arr){
        arr[0] = 99;
    }
}
// Strings are inmutable in java
// Arrays are Mutable in java (Mutable means you can change the object)
