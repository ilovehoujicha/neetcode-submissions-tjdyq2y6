class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("\\s", "");
        int len = s.length();
        int loop_count = len / 2;
        for (int i = 0; i < loop_count; i++) {
            if (s.charAt(i) == s.charAt(len - 1 - i)) continue;
            return false;
        }
        return true;
    }
}
