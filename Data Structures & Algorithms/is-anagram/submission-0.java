class Solution {
    public boolean isAnagram(String s, String t) {
        for (char letter : s.toCharArray()) {
            if (t.indexOf(letter) == -1) {
                return false;
            }
        }
        return true;
    }
}
