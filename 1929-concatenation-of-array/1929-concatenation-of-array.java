class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;

        int i = 0, j = n - 1;
        int k = n, l = 2 * n - 1;

        int[] ans = new int[2 * n];
        while (i <= j) {
            ans[i] = nums[i];
            ans[j] = nums[j];
            ans[k] = nums[i];
            ans[l] = nums[j];

            i++;
            j--;
            k++;
            l--;
        }
        return ans;
    }
}