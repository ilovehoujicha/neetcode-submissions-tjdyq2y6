class Solution {
    public boolean isValid(String s) {
        Stack<Character> opening_stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                opening_stack.push(bracket);
            }
            else {
                if (opening_stack.isEmpty()) return false;
                if ((bracket == ')' && opening_stack.peek() == '(') || (bracket == '}' && opening_stack.peek() == '{') || (bracket == ']' && opening_stack.peek() == '[')) {
                    opening_stack.pop();
                } else {
                    return false;
                }
            }
        }
        return opening_stack.isEmpty();
    }
}
