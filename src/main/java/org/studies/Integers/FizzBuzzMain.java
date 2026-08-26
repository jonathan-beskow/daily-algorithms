package org.studies.Integers;

import java.util.Arrays;

public class FizzBuzzMain {


    public static String[] fizzBuzz(int n) {
        String[] s = new String[n];
        int position = 0;
        for (int i = 1; i <= s.length; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                s[position] = "FizzBuzz";
                position++;
            } else if (i % 3 == 0) {
                s[position] = "Fizz";
                position++;
            } else if (i % 5 == 0) {
                s[position] = "Buzz";
                position++;
            } else {
                s[position] = String.valueOf(i);
                position++;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzBuzz(15)));
    }


}
