package TwoPointer;

public class ValidPalindrome {

    public static void main(String[] args){

        System.out.println(isPalindrome("Was it a car or a cat i saw?")); // => true
        System.out.println(isPalindrome("tab a cat")); // => false
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int end = s.length() - 1;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(end)) {
                return false;
            }

            end--;
        }

        return true;
    }
}
