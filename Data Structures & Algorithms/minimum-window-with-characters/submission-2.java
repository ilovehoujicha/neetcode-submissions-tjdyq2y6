class Solution {
    public String minWindow(String s, String t) {
        int[] need = new int[128];

        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int left = 0;
        int counter = t.length();
        int min_length = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {
            char rc = s.charAt(right);
            if (need[rc] > 0) counter--;
            need[rc]--;

            while (counter == 0) {
                if (right - left + 1 < min_length) {
                    min_length = right - left + 1;
                    start = left;
                }

                char lc = s.charAt(left);
                need[lc]++;
                if (need[lc] > 0) counter++;
                left++;
            }
        }
        return min_length == Integer.MAX_VALUE ? "" : s.substring(start, start + min_length);
    }
}
