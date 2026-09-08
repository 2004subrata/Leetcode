class Solution {
    public int countCommas(int n) {
        int count = n - 1000;
        return count < 0 ? 0 : count + 1;
    }
}