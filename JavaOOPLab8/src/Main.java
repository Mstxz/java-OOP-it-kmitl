import java.util.Scanner;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();  // Close scanner to prevent resource leaks

        switch (num) {
            case 1:
                SwingUtilities.invokeLater(CalculatorOneGUI::new);
                break;
            case 2:
                SwingUtilities.invokeLater(CalculatorTwoGUI::new);
                break;
            case 3:
                SwingUtilities.invokeLater(TellerGUI::new);
                break;
            case 4:
                SwingUtilities.invokeLater(MDIFormGUI::new);
                break;
            default:
                System.out.println("Invalid.");
        }
    }
}
