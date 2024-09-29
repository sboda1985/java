import java.util.ArrayList;
import java.util.List;

public class KthOccurenceInLexicographicalOrder {
    public void generate(int temp, int n, int target, int counter, List<Integer> result){

        if (result.size() == target){
            return;
        }
        if (temp>n) {
            return;
        }
        result.add(temp);
        generate(temp*10, n, target, counter+1, result);
         if (temp%10 != 9) {
           generate(temp+1, n, target, counter+1, result);
       }
        //return temp;
    }
    public int findKthNumber(int n, int k) {
        List<Integer> result = new ArrayList<Integer>();
        generate(1, n, k, 1, result);
        return result.getLast();
    }
}
