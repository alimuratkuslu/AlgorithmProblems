package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutDuplicates {

    public static void main(String[] args){

        System.out.println(lengthOfLongestSubstring("zxyzxyz")); // => 3
        System.out.println(lengthOfLongestSubstring("xxxx")); // => 1
        System.out.println(lengthOfLongestSubstring("pwwkew")); // => 3
    }

    public static int lengthOfLongestSubstring(String s) {

        int longest = 0;
        Set<Character> set = new HashSet<>();
        int p1 = 0;
        int p2 = 0;

        while(p2 < s.length()){
            if(!set.contains(s.charAt(p2))){
                set.add(s.charAt(p2));
                p2++;
                longest = Math.max(longest, set.size());
            }
            else{
                set.remove(s.charAt(p1));
                p1++;
            }
        }

        return longest;
    }
}
