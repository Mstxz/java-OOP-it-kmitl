import java.util.Scanner;

public class Dump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyAdd cm = new MyAdd();

        System.out.println("Enter Number:");
        int x = sc.nextInt();
        int num = cm.addTwo(x);
        System.out.println("Result: " + num);

        num = cm.addTwo(x+5);
        System.out.println("Result: " + num);

        num = cm.addTwo(x*3+2);
        System.out.println("Result: " + num);


    }
}

class MyAdd {
    public int addTwo(int a) {
        return a + 2;
    }
}