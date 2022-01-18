package lt.codeacademy;

import java.util.Arrays;

import static lt.codeacademy.ConsolePrinter.*;

public class Main {

    public static void main(String[] args) {
        int[] digits = new int[2];
        digits[0] = 1;
        digits[1] = 2;
//        digits[2] = 2;  negalimas

        for (int i = 0; i < digits.length; i++) {
            print(digits[i]);
        }

        //foreach
        for (int digit: digits) {
            print(digit);
        }

        print(Arrays.toString(digits));
    }
}
