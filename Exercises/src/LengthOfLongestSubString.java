import java.util.HashMap;

public class LengthOfLongestSubString {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> frequency = new HashMap<>();
        int counter = 0;
        int maxLength = -1;
        int currentLength = 0;
        int lastReset = 0;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if (frequency.containsKey(c)){

                if (currentLength > maxLength){
                    maxLength = currentLength;
                }

                currentLength = counter - frequency.get(c);
                frequency.put(c, counter);
                lastReset = counter;
            } else {
                frequency.put(c, counter);
                currentLength++;
            }
            counter++;
        }
        if (currentLength > maxLength){
            return currentLength;
        }
        return maxLength;
    }
}
