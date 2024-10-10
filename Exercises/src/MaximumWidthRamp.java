import java.util.Stack;

public class MaximumWidthRamp {

    public int maxWidthRamp(int[] nums) {
        Stack<Integer> minimums = new Stack<>();
        for(int index = 0; index < nums.length; index++){
            if (minimums.isEmpty() || nums[minimums.peek()] > nums[index]){
                minimums.push(index);
            }
        }
        int result = 0;
        for(int index = nums.length - 1; index > 0; index--){
            while (!minimums.isEmpty() && nums[index] >= nums[minimums.peek()]) {

                result = Math.max(result, index - minimums.pop());
            }
        }
        return result;
    }
}
