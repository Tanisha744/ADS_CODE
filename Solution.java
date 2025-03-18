import java.util.*;
public class Solution {
	public static int lengthOfLongestSubstring(String s) {
		// Write your code here.
		if (s.length() == 0) return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);

            // Shrink window if more than 2 distinct characters
            while (map.size() > 2) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
	}
}