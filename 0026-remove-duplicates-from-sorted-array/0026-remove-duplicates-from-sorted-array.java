class Solution {
    public int removeDuplicates(int[] nums) {
        // 1 2 3 3 4 4 4
        //     j
        //   k

        int n = nums.length;

        if (n == 0)
            return 0;

        int k = 1;
        for (int j = 1; j < n; j++) {
            if (nums[j] != nums[j - 1]) {
                nums[k] = nums[j];
                k += 1;
            }
        }
        return k;
    }
}