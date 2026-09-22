public class Swap_Array {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 9, 2, 1, 2};
        swap(arr, 0, 4);
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
