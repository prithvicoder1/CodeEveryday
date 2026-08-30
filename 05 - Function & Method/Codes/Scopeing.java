public class Scopeing {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
    }
    static void random(String naam){
       naam = "Prithvi Vijay"; // create a new object
    }

    static void swap(int num1, int num2){
        int temp = num1;
        num1 =  num2;
        num2 = temp;


    // this chnage will only be valid in this function scope only.
    }
}
