import java.util.Scanner;

public class L03_Loop02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int odd = 0;
        int even = 0;
        while (true) { 
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            else if (num%2 != 0) {
                odd++;
            }
            else {
                even++;
            }
        }
        System.out.println("Odd number = " + odd + " and Even number = " + even);
    }
}