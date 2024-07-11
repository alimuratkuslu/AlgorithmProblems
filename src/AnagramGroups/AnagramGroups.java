package AnagramGroups;

import java.util.HashMap;
import java.util.List;

public class AnagramGroups {

    public static void main(String[] args){

        String[] strings1 = new String[]{"act","pots","tops","cat","stop","hat"};
        String[] strings2 = new String[]{"x"};
        String[] strings3 = new String[]{""};

        System.out.println(groupAnagrams(strings1)); // => [["hat"],["act", "cat"],["stop", "pots", "tops"]]
        System.out.println(groupAnagrams(strings2)); // => [["x"]]
        System.out.println(groupAnagrams(strings3)); // => [[""]]
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        for(int i = 0; i < strs.length; i++){
            
        }
    }
}
