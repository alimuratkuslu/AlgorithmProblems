package ArraysHashing;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args){

        String[] strings1 = new String[]{"act","pots","tops","cat","stop","hat"};
        String[] strings2 = new String[]{"x"};
        String[] strings3 = new String[]{""};

        System.out.println(groupAnagrams(strings1)); // => [["hat"],["act", "cat"],["stop", "pots", "tops"]]
        System.out.println(groupAnagrams(strings2)); // => [["x"]]
        System.out.println(groupAnagrams(strings3)); // => [[""]]
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            String curString = strs[i];
            char tempArray[] = curString.toCharArray();
            Arrays.sort(tempArray);
            String sortedCurString = new String(tempArray);

            if(map.containsKey(sortedCurString)) {
                List<String> tempList = map.get(sortedCurString);
                tempList.add(curString);
                map.put(sortedCurString, tempList);
            }
            else {
                List<String> tempList = new ArrayList<>();
                tempList.add(curString);
                map.put(sortedCurString, tempList);
            }
        }

        for(Map.Entry<String, List<String>> set : map.entrySet()) {
            res.add(set.getValue());
        }

        return res;
    }
}
