import java.util.Scanner;

/**
 * This program will convert binary into decimal form and vice versa.
 *@author: Alec Thoman
 *@date: 07/26/19
 */
public class Bindec {
    public static void main(String[] args) {
// Declarations
    String ask;
    double deci;
    int convert;
    String bin;
    double conDeci;
// Ask for Input
    Scanner in = new Scanner(System.in);
// Conversion
    System.out.println("Do you want to convert a decimal or binary number into the other?");
    ask = in.nextLine();
    if (ask.equals("Decimal")) {
        System.out.println("Please enter the decimal: ");
        deci = in.nextDouble();
        System.out.println("The binary form of " + deci + " would be: " + Long.toBinaryString(Double.doubleToRawLongBits(deci)));
    } else if (ask.equals("Binary")) {
        System.out.println("Please enter the binary number: ");
        bin = in.nextLine();
        System.out.println("The decimal form of " + bin + " would be: " + Integer.parseInt(bin,2));
    } else {
        System.out.println("You did not enter a valid response. Your response needs to be either Decimal or Binary.");
    }
    }
}

    