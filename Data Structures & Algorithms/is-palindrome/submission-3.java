class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("\\s", "");
        int len = s.length();
        int loop_count = len / 2;
        for (int p1 = 0, p2 = len - 1 ; p1 < loop_count; p1++, p2--) {
            while (!Character.isLetterOrDigit(s.charAt(p1))) p1++;
            while (!Character.isLetterOrDigit(s.charAt(p2))) p2--;
            if (s.charAt(p1) == s.charAt(p2)) continue;
            return false;
        }
        return true;
    } te#e?t
}
