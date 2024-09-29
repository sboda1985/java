import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        int numsLen = nums.length;
        for (int i = 0; i < numsLen; i++) {
            if (nums[i] != val) {
                list.add(nums[i]);
            }
        }
        int index = 0;
        for (int number : list){
            nums[index]  = number;
            index++;
        }
        return index;
    }
}
