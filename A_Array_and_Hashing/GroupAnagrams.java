package A_Array_and_Hashing;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0)
            return res;
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] hash = new int[26];
            for (char c : s.toCharArray()) {
                hash[c - 'a']++;
            }
        String key = new String(Arrays.toString(hash));
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        // map.get(key).add(s);
        }
        res.addAll(map.values());
        return res;
    }

    public static void main(String[] args) {
        String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(groupAnagrams(str));
    }
}
