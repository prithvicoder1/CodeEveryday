
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
    ArrayList<Integer> list = new ArrayList<>(10); 
    
    // list.add(67);
    // list.add(673);
    // list.add(6744);
    // list.add(6724);
    // list.add(444);
    // list.add(442555);
    // list.add(424);
    // list.add(42255);


    
    // System.out.println(list.contains(70994));
    // System.out.println(list);
    // list.set(5, 99);

    // list.remove(2);
    // System.out.println(list);


    // input
    for (int i = 0; i < 5; i++) {
        list.add(in.nextInt());
    }
    System.out.println(list);


    // get item at any index
    for (int i = 0; i < 5; i++) {
        System.out.println(list.get(i)); //pass index here, list{index} syntax will not work here
    }
    }
}
