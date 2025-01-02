package Stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args){

        System.out.println(generateParenthesis(3)); // ["((()))","(()())","(())()","()(())","()()()"]
        System.out.println(generateParenthesis(1)); // ["()"]
    }

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();

        backtrack(res, "", 0, 0, n);
        for(int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i));
        }
        return res;
    }

    public static void backtrack(List<String> resList, String curString, int openCount, int closeCount, int n) {

        if(curString.length() == n * 2) {
            resList.add(curString);
            return;
        }

        if(openCount > closeCount) {
            backtrack(resList, curString + ")", openCount, closeCount + 1, n);
        }

        if(openCount < n) {
            backtrack(resList, curString + "(", openCount + 1, closeCount, n);
        }
    }
}
