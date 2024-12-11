import java.util.*;

public class Loop01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Formatter formatter = new Formatter();
        int i = 0;
        int oddcount = 0;
        int evencount = 0;
        while(i != -1){
            i = sc.nextInt();
           if (i == -1) {
               break;
           }
            else if (i % 2 == 0){
                evencount++;
            }
            else {
                oddcount++;
            }
        }
        System.out.println(formatter.format("Odd number = %d and Even Number = %d",oddcount,evencount));
    }
}
