package org.studies.Integers;

public class TrailingZeros {

    public static int trailingZeroes(int n) {
        int zeros = 0;
        int currPowerOfFive = 5;
        int count = 0;
        while (n >= currPowerOfFive) {
            count += (n/currPowerOfFive);
            currPowerOfFive *= 5;
        }
        return count;
    }



    public static void main(String[] args) {

        System.out.println(trailingZeroes(5));
    }

}
