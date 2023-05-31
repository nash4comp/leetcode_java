package A_Array_and_Hashing;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        // Check the length of two strings
        // Returns false if the length between two strings is different.
        int length = s.length();
        if (length != t.length()) {
            return false;
        }
        int[] sChar = new int['z' - 'a' + 1];
        int[] tChar = new int['z' - 'a' + 1];
        
        for (int i = 0; i < length; i++) {
            sChar[(int)s.charAt(i) - 'a']++;
            tChar[(int)t.charAt(i) - 'a']++;
        }

        if (Arrays.equals(sChar,tChar)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str1 = "rat";
        String str2 = "car";
        System.out.println(isAnagram(str1, str2));
    }
}
