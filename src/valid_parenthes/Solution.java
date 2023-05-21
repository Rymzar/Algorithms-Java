package valid_parenthes;

import java.util.HashMap;
/*
 * Version 2
*/
public class Solution {
    public boolean isValid(String testString) {
        if (testString == null || "".equals(testString)) return false;
        if (testString.length() % 2 != 0) return false;
        HashMap<Character, Character> hashMap = new HashMap<Character, Character>();
        hashMap.put('<', '>');
        hashMap.put('{', '}');
        hashMap.put('[', ']');
        hashMap.put('(', ')');
        char[] charArray = testString.toCharArray();
        for (int i = 0, j = i + 1; j < charArray.length; i = i + 2, j = i + 1) {
            char currentc = charArray[i];
            char nextc = charArray[j];
            char closingChar = hashMap.get(currentc);
            if (closingChar != nextc)
                return false;
        }
        return true;
    }
}
