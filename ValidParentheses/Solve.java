package ValidParentheses;

import java.util.Stack;

public class Solve {
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((top == '(' && ch != ')') ||
                        (top == '{' && ch != '}') ||
                        (top == '[' && ch != ']')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static int numberValidParentheses(String str) {

        int count = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty()) {
                stack.pop(); // Pop the matching '('
                count += 2; // Increment the count of valid pairs
            }
            // No need to handle else case since other characters are ignored
        }

        return count;
    }

    public static void main(String[] args) {
        // String str = "[{()}]";
        // String str = "[]}";
        // String str = ")()())()";
        String str = "()(()";
        // String str = "(()";

        // System.out.println(isValid(str));
        System.out.println(numberValidParentheses(str));
    }

}
