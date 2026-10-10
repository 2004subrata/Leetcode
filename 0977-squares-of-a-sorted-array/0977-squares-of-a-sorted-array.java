class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        if (nums[0] >= 0) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[i] * nums[i];
            }
            return nums;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                negative.add(nums[i]);
            } else {
                positive.add(nums[i]);
            }

        }

        int[] result = new int[nums.length];
        int i = negative.size() - 1;
        int j = 0;
        int idx = 0;

        while (i >= 0 && j < positive.size()) {
            if ((positive.get(j) * positive.get(j)) < (negative.get(i) * negative.get(i))) {
                result[idx] = positive.get(j) * positive.get(j);
                idx++;
                j++;
            } else {
                result[idx] = negative.get(i) * negative.get(i);
                idx++;
                i--;
            }
        }

        if (i < 0 && j < positive.size()) {
            for (int k = j; k < positive.size(); k++) {
                result[idx] = positive.get(j) * positive.get(j);
                idx++;
                j++;
            }
            return result;
        } else if (j == positive.size() && i >= 0) {
            for (int k = i; k >= 0; k--) {
                result[idx] = negative.get(i) * negative.get(i);
                idx++;
                i--;
            }
            return result;
        }

        return result;
    }
}