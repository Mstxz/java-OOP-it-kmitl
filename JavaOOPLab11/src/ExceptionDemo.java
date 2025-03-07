public class ExceptionDemo {
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0;

        try {
            if (args.length != 3) {
                throw new IllegalArgumentException("Please enter 3 numbers as a, b, and c respectively.");
            }


            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
            c = Double.parseDouble(args[2]);

        } catch (NumberFormatException e) {
            System.out.println("Please input data in number format only.");
            return;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
    }
}
