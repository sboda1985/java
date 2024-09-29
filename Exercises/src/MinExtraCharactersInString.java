import java.util.*;

public class MinExtraCharactersInString {

        public int minExtraChar(String s, String[] dictionary) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(dictionary));
        int[] dp = new int[s.length() + 1];
        for(int i = 0; i < s.length() + 1; i++){
            dp[i] = 0;
        }
        for(int i=s.length()-1; i>=0; i--){
            dp[i] = dp[i+1] + 1;
            for(int length = 1; length < s.length()-i+1 ; length++){

                if (wordSet.contains(s.substring(i, i+length)))  {

                    dp[i] = Math.min(dp[i], dp[i+length] );

                }
            }
        }
        return dp[0];
    }
}
