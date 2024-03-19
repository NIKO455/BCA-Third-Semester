/*
 * InputMismatchException is specific for the Scanner . It indicates invalid type, not necessarily 
 * an invalid number. NumberFormatException is specific for trying to convert a non numeric string 
 * to a number.
 */

import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter a number: ");
            int number = input.nextInt();

            System.out.println(number);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            input.close();
        }
    }
}
