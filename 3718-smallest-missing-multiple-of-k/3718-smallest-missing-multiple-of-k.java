class Solution {
    public int missingMultiple(int[] nums, int k) {
        int[] hash = new int[101];
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]] += 1;
        }

        int i = k;
        while (i < hash.length) {
            if (hash[i] == 0) {
                smallest = i;
                return smallest;
            }

            smallest = i + k;
            i += k;
        }

        return smallest;
    }
}