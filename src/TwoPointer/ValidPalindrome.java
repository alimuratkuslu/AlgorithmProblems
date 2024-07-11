package TwoPointer;

public class ValidPalindrome {

    public static void main(String[] args){

        System.out.println(isPalindrome("Was it a car or a cat I saw?")); // => true
        System.out.println(isPalindrome("tab a cat")); // => false
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int endOfString = s.length() - 1;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(endOfString)){
                return false;
            }
            endOfString--;
        }

        return true;
    }
}
