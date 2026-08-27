package org.studies.Integers;

import java.util.Arrays;

public class PalindromeNumber {

    /*
    * Minha solução convertendo para String
    * */
    public static boolean isPalindrome(int n) {
        if (n < 0) return false;
        String t = String.valueOf(n);
        int i = 0;
        int j = t.length() - 1;
        while (i < j) {
            char f = t.charAt(i);
            char l = t.charAt(j);
            if (f != l) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //resposta otimizada
    public static boolean optimizedPalindrome(int x) {
        if (x < 0) return false;
        if (x != 0 && x % 10 == 0) return false;
        int reverse = 0;
        while (x > reverse) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }
        return (x == reverse) || (x == reverse / 10);
    }

    public static void main(String[] args) {
        isPalindrome(12321);
    }


}
