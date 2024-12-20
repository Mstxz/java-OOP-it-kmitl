import java.util.Scanner;

public class L03_Loop04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i%5 == 0) {
                System.out.println("|");
            } 
            else {
                System.out.print("|");
            }
        }
    }
}
