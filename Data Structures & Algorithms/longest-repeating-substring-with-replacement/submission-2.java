class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int most_frequent = 0;
        int[] counter = new int[26];
        
        for (int left = 0, right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            counter[c - 'A']++;
            most_frequent = Math.max(counter[c - 'A'], most_frequent);

            while ((right - left + 1) - most_frequent > k) {
                counter[s.charAt(left) - 'A']--;
                left++;
            }
            max = Math.max(right - left + 1, max);
        }
        return max;
    }
}
