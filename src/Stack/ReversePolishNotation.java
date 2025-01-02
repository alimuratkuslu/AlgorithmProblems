package Stack;

import java.util.Stack;

public class ReversePolishNotation {

    public static void main(String[] args){

        String[] strings1 = new String[]{"2","1","+","3","*"};
        String[] strings2 = new String[]{"4","13","5","/","+"};
        String[] strings3 = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        System.out.println(evalRPN(strings1)); // => 9
        System.out.println(evalRPN(strings2)); // => 6
        System.out.println(evalRPN(strings3)); // => 22
    }

    public static int evalRPN(String[] tokens) {

        Stack<String> stack = new Stack<>();
        int res = 0;

        for(int i = 0; i < tokens.length; i++) {
            String c = tokens[i];

            if(c.equals("+")) {
                int firstNum = Integer.parseInt(stack.peek());
                stack.pop();
                int secondNum = Integer.parseInt(stack.peek());
                stack.pop();

                int tempRes = firstNum + secondNum;
                stack.push(String.valueOf(tempRes));
            } else if(c.equals("-")) {
                int firstNum = Integer.parseInt(stack.peek());
                stack.pop();
                int secondNum = Integer.parseInt(stack.peek());
                stack.pop();

                int tempRes = secondNum - firstNum;
                stack.push(String.valueOf(tempRes));
            } else if(c.equals("*")) {
                int firstNum = Integer.parseInt(stack.peek());
                stack.pop();
                int secondNum = Integer.parseInt(stack.peek());
                stack.pop();

                int tempRes = firstNum * secondNum;
                stack.push(String.valueOf(tempRes));
            } else if(c.equals("/")) {
                int firstNum = Integer.parseInt(stack.peek());
                stack.pop();
                int secondNum = Integer.parseInt(stack.peek());
                stack.pop();

                int tempRes = secondNum / firstNum;
                stack.push(String.valueOf(tempRes));
            } else {
                stack.push(c);
            }
        }

        res += Integer.parseInt(stack.peek());

        return res;
    }
}
