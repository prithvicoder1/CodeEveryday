import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID){
            case 1:
                System.out.println("Prithvi Vijay");
                break;
            case 2:
                System.out.println("Richa Vijay");
                break;
             case 3:
                System.out.println("Emp Number 3");
                switch(department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Departement");
                     break;
                     default:
                        System.out.println("No department enterd");   

                }
                break;
                default:
                    System.out.println("Enter correct EmpId");
               
        }
    }
}
