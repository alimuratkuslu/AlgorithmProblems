package AnagramGroups;

import java.util.*;

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

        HashMap<HashMap<Character, Integer>, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            HashMap<Character, Integer> patternMap = new HashMap<>();
            patternMap = calculatePattern(strs[i], patternMap);

            List<String> tempList;
            if(map.containsKey(patternMap)){
                tempList = map.get(patternMap);
            }
            else{
                tempList = new ArrayList<>();
            }
            tempList.add(strs[i]);
            map.put(patternMap, tempList);
        }

        List<List<String>> resList = new ArrayList<>();
        for(Map.Entry<HashMap<Character, Integer>, List<String>> set : map.entrySet()){
            resList.add(set.getValue());
        }

        return resList;
    }

    private static HashMap calculatePattern(String s, HashMap<Character, Integer> map){
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }

        return map;
    }
}
