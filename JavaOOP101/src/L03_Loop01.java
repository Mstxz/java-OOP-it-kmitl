import java.util.Scanner;

public class L03_Loop01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("กรุณาระบุความสูงตึก: ");
        int height = sc.nextInt();
        for (int i = 0; i < height; i++) {
            System.out.println("#-#-#-#-#");
        }
    }
}
