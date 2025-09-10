/*Write a Java program to determine if a string containing only the characters
'(', ')', '{', '}', '[' and ']' is valid. The string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 */
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty(); // The stack must be empty for a valid string
    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        String s5 = "{[]}";
        String s6 = "(()";

        System.out.println("'" + s1 + "' is valid: " + isValid(s1));
        System.out.println("'" + s2 + "' is valid: " + isValid(s2));
        System.out.println("'" + s3 + "' is valid: " + isValid(s3));
        System.out.println("'" + s4 + "' is valid: " + isValid(s4));
        System.out.println("'" + s5 + "' is valid: " + isValid(s5));
        System.out.println("'" + s6 + "' is valid: " + isValid(s6));
    }
}
/*
output:
'()' is valid: true
'()[]{}' is valid: true
'(]' is valid: false
'([)]' is valid: false
'{[]}' is valid: true
'(()' is valid: false
 */