package Stack;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args){

        System.out.println(isValid("()")); // => true
        System.out.println(isValid("()[]{}")); // => true
        System.out.println(isValid("(]")); // => false
        System.out.println(isValid("([])")); // => true
        System.out.println(isValid("([}}])")); // => false
    }

    public static boolean isValid(String s) {
        if(s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else if(s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }
            else if(s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
            else if(s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
