class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numStack = new Stack<>();

        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int op1 = numStack.pop();
                int op2 = numStack.pop();
                switch (s) {
                    case "+":
                        numStack.push(op2 + op1);
                        break;
                    case "-":
                        numStack.push(op2 - op1);
                        break;
                    case "*":
                        numStack.push(op2 * op1);
                        break;
                    case "/":
                        numStack.push(op2 / op1);
                        break;
                    default:
                        break;
                }
            } else {
                numStack.push(Integer.parseInt(s));
            }
        }
        return numStack.peek();
    }
}
