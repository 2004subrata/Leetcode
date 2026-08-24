class Solution {
    public int findNumbers(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        int digit = 0;
        while (left <= right) {
            if((left == right) && (String.valueOf(nums[left]).length() % 2 == 0)){
                digit+=1;
                break;
            }
            if (String.valueOf(nums[left]).length() % 2 == 0)
                digit += 1;
            if (String.valueOf(nums[right]).length() % 2 == 0)
                digit += 1;
            left++;
            right--;
        }
        return digit;
    }
}