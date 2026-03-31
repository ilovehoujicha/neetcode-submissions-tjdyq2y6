class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<Character> set = new HashSet<>();
        for (int start = 0, end = 0; end < s.length(); end++) {
            char current = s.charAt(end);
            if (set.contains(current)) {
                max = Math.max(max, set.size());
                while (set.contains(current)) {
                    set.remove(s.charAt(start));
                    start++;
                }
            }
            set.add(current);
            max = Math.max(max, set.size());
        }
        return max;
    }
}
