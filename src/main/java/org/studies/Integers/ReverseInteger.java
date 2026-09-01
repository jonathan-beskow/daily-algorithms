package org.studies.Integers;

import java.io.FilterOutputStream;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(12345));
    }

    public static int reverse(int x) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        if (x == min || x == max) {
            return 0;
        }
        int reverse = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            if (reverse > max/10) return 0;
            if (reverse < min/10) return 0;
            reverse = reverse * 10 + lastDigit;
            x = x /10;
        }
        return reverse;
    }



}
