/*
 * Paolo T. Inocencion
 * Coding Challenge 2
 *
 * Write a program in your preferred language that consumes a binary
 * number and produces its decimal equivalent. (40 points)
 */

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {

        //Scanner that will take binary digits from user,
        Scanner sc = new Scanner(System.in);

        // keep looping if input is not 0 or 1 only
        while (true) {
            System.out.println("Enter a binary number: ");

            //store the input as Strings in string
            String input = sc.nextLine();

            // regex if input contains anything other than 1's and 0's, loop
            if (input.matches("[01]+")) {
                System.out.println(input + " in Decimal is: "
                        + Integer.parseInt(input, 2));
                //parse the string into integer base 10, output result.
                break;
            }
            else
                System.out.println("Enter binary numbers only.\n");

        }
    }

}
