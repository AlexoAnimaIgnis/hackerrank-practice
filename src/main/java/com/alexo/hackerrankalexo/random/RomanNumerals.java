package com.alexo.hackerrankalexo.random;

/**
 * Consider you've been given a positive integer, n.
 * Write a snippet of code that converts this number into its Roman number representation.
 * For example, if n=34, then the Roman number is XXXIV.
 */
public class RomanNumerals {

    private static final String[]
            HUNDREDTHS
            = {"", "C", "CC", "CCC", "CD",
            "D",
            "DC", "DCC", "DCCC", "CM"};
    private static final String[] TENS
            = {"", "X", "XX", "XXX",
            "XL", "L", "LX", "LXX",
            "LXXX", "XC"};
    private static final String[] ONES
            = {"", "I", "II", "III", "IV",
            "V",
            "VI", "VII", "VIII", "IX"};

    public static void main(String[] args) {
        System.out.println(convert(34));
    }
    public static String convert(int n) {
        String roman = "";
        // Step 1
        while (n >= 1000) {
            roman = roman + 'M';
            n -= 1000;
        }
        // Step 2
        roman = roman + HUNDREDTHS[n /
                100];
        n = n % 100;
        // Step 3
        roman = roman + TENS[n / 10];
        n = n % 10;
        // Step 4
        roman = roman + ONES[n];
        return roman;
    }

    public String solution(String s) {
        int number = 12345;

        int unitPlace = number % 10;
        int tenthsPlace = (number / 10) % 10;
        int hundredthsPlace = (number / 100) % 10;
        int thousandthsPlace = (number / 1000) % 10;
        return "";
    }

}
