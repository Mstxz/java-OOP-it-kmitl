import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        switch (num){
            case 1: 
                new CalculatorOneGUI();
                break;
            case 2:
                new CalculatorTwoGUI();
                break;
            case 3:
                new TellerGUI();
                break;
            case 4:
                new MDIFormGUI();
                break;
            default:
                System.out.println("Invalid.");
        }
    }
}
