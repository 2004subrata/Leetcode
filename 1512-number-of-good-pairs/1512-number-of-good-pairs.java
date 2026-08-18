class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodpairs = 0;
        int n = nums.length;
        int[] hash = new int[101];

        for (int i = 0; i < n; i++) {
            hash[nums[i]] += 1;
        }

        for (int i = 0; i < 101; i++) {
            if (hash[i] > 1) {
                int sum = ((hash[i] - 1) * hash[i]) / 2;
                goodpairs += sum;
            }
        }

        return goodpairs;

    }
}