// What happens if you don't include a break in a switch case?
import java.util.Scanner;
public class CL_Q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();

      switch(name){
      case "Prithvi":
        System.out.println("Is the best person in the world");

        case "Richa":
            System.out.println("Worlds bads girl");

        case "Gaurav":
        System.out.println("Nike name is Omphho beta");

        default :
        System.out.println("Enter the valid name");
      }

    }
}


// the code execution falls through to th enext case.