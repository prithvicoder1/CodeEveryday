import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
    
        switch(fruit){
            case "Mango":
                System.out.println("king of teh Fruit");
                break;
            case"Apple":
            System.out.println("Sweet Red Fruit");
            break;
            case "Orange":
                System.out.println("Round Fruit");
            break;
            case "Graphs":
                System.out.println("Small Fruit");
                break;
            default:
                System.out.println("Please enter the valid fruit");
        }
    }
}
