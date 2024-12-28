package Stack;

public class ValidParentheses {

    public static void main(String[] args){

        System.out.println(isValid("()")); // => true
        System.out.println(isValid("()[]{}")); // => true
        System.out.println(isValid("(]")); // => false
        System.out.println(isValid("([])")); // => true
    }

    public static boolean isValid(String s) {
        return false;
    }
}
