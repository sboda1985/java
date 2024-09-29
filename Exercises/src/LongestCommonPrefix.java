import java.util.*;
import java.util.stream.Collectors;

public class LongestCommonPrefix {

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int max = 0;

        HashMap<String, Integer> prefixes = new HashMap<>();
        Set<String> stringSet1 = Arrays.stream(arr1).mapToObj(String::valueOf).collect(Collectors.toSet());
        Set<String> stringSet2 = Arrays.stream(arr2).mapToObj(String::valueOf).collect(Collectors.toSet());

        for(String value : stringSet1){
            String key = "";
            for(char c : value.toCharArray()){
                key += c;
                prefixes.put(key, prefixes.getOrDefault(key, 0) + 1);

            }
        }
        for(String value : stringSet1){
            String key = "";
            for(char c : value.toCharArray()){
                key += c;
                if(prefixes.containsKey(key)){
                    max = Math.max(max, key.length());
                }

            }
        }
        return max;
    }
}
