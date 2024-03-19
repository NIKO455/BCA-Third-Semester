import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter first number:");
            int Num1 = in.nextInt();

            System.out.println("Enter second number:");
            int Num2 = in.nextInt();

            System.out.println(Num1 / Num2);

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            in.close();
        }

    }
}
