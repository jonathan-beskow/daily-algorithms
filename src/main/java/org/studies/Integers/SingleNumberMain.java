package org.studies.Integers;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberMain {


    public static void main(String[] args) {
        int[] array = {4,1,2,1,2};
        System.out.println(singleNumberXOR(array));
    }

    /*
    * A ideia aqui é usar o operador XOR
    * Abaixo minha solução com força bruta e abaixo dela a solução mais performática
    * */

    public static Integer singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        var value = set.toArray();
        return  (int) value[0];
    }

    /*
     * Solução usando XOR.
     *
     * O operador XOR possui duas propriedades importantes:
     * - Um número XOR com ele mesmo resulta em 0: a ^ a = 0
     * - Um número XOR com 0 resulta nele mesmo: a ^ 0 = a
     *
     * Como todos os números repetidos aparecem duas vezes, eles se anulam durante
     * a operação de XOR. No final, sobra apenas o número que aparece uma única vez.
     *
     * Exemplo:
     * 4 ^ 1 ^ 2 ^ 1 ^ 2
     * = 4 ^ (1 ^ 1) ^ (2 ^ 2)
     * = 4 ^ 0 ^ 0
     * = 4
     *
     * Complexidade de tempo: O(n), pois percorremos o array uma vez.
     * Complexidade de memória: O(1), pois não usamos estrutura auxiliar.
     */
    public static Integer singleNumberXOR(int[] nums) {
        int singleNum = 0;

        for (int num : nums) {
            singleNum = singleNum ^ num;
        }

        return singleNum;
    }
}
