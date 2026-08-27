package org.studies.Integers;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {


    public static int longgestSubstring(String s) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (!map.containsKey(ch)) {
                map.put(ch, right);
            } else {
                left = Math.max(left, map.get(ch) + 1);
                map.put(ch, right);
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }


    public static void main(String[] args) {

    }
}
