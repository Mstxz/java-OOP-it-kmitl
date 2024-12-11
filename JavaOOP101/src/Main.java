import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the prize:");
        double prize = sc.nextDouble();
        System.out.println("Enter the code:");
        String code = sc.nextLine();
        
        if (code.equals("105")) { //compare with address var
            System.out.println("Discount 10%");
            System.out.println("Prize: " + 0.9 * prize);
        }
        else {
            System.out.println("No Discount");
            System.out.println("Prize: " + prize);
        }
    }
}
