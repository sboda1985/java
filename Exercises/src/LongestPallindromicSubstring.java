import java.util.HashMap;

public class LongestPallindromicSubstring {

    public String longestPalindrome(String s) {
        String maxPallindrom = "";
        if (s.length() <= 1) return s;
        HashMap<String, Boolean> map = new HashMap<>();
        if (isPalindrome(s)) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (j - i > maxPallindrom.length()) {
                    String partial = s.substring(i, j);
                    if (!map.containsKey(partial)) {
                        if (isPalindrome(partial)) {
                            map.put(partial, true);
                            maxPallindrom = partial;
                        } else {
                            map.put(partial, false);
                        }
                    }
                }
            }
        }
        return maxPallindrom;
    }

    public boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
