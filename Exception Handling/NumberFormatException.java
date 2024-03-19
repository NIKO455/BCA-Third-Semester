/*
 * InputMismatchException is specific for the Scanner . It indicates invalid type, not necessarily 
 * an invalid number. NumberFormatException is specific for trying to convert a non numeric string 
 * to a number.
 */

public class NumberFormatException {
    public static void main(String[] args) {

        try {

            String number = "ram";

            System.out.println(Integer.parseInt(number));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
