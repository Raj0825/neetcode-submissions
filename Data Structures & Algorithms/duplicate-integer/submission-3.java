class Solution {
    public boolean hasDuplicate(int[] nums) {
        int right = 0;

        while(right < nums.length){
            int left = right + 1;

            while(left < nums.length){
                if(nums[right] == nums[left]){
                    return true;
                }
                left++;
            }
            right++;
        }
        return false;
    }
}