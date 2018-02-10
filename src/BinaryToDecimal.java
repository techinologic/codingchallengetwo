/**
 * Convert Binary to Decimal
 * BinaryToDecimal converts user inputted
 * binary numbers into decimal.
 *
 * @author  Paolo T. Inocencion
 * @version 1.0
 * @since   2018-02-09
 */

import java.util.Scanner;

public class BinaryToDecimal {

    /**
     * The main method which makes use of convertToDecimal method.
     * @param args Unused.
     * @exception NumberFormatException On non-binary input.
     * @see NumberFormatException
     */
    public static void main(String[] args) {

        //Scanner that will take binary digits from user,
        Scanner sc = new Scanner(System.in);

        // keep looping if input is not 0 or 1 only
        System.out.print("Enter a binary number: ");

        //store the input as Strings in string
        String input = sc.nextLine();

        // validate input, print decimal value,
        // print exception if input is not binary
        try {
            System.out.println("Decimal: " + convertToDecimal(input));
        } catch (NumberFormatException e) {
            //raise exception and output what error.
            System.err.println("NumberFormatException: "
                    + e.getMessage());
        }
    }

    /**
     * This method is used convert input binary string from
     * a base 2, to a decimal value using the parseInt method.
     * The int value will be multiplied to 1.0 to become a double.
     * @param input only parameter, came from user input.
     * @return double This returns decimal value of string.
     */
    public static double convertToDecimal(String input) {

        return (Integer.parseInt(input, 2) * 1.0);
    }
}
