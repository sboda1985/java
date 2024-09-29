public class SearchInsertInOLogN {
    public int searchPartialNums(int[] nums, int target, int left, int right) {

        if (left > right){
            return left;
        }
        int mid = (left + right) / 2;
        System.out.println(left + " " + right + " " + mid + " " + nums[mid]);
        if (nums[mid] == target){
            return mid;
        }
        if (nums[mid] > target){
            return searchPartialNums(nums, target, left, mid - 1);
        } else {
            return searchPartialNums(nums, target, mid + 1, right);
        }
    }
    public int searchInsert(int[] nums, int target) {
        return searchPartialNums(nums, target, 0, nums.length - 1);
    }

}
