class Solution {
    public int longestPalindrome(String s) {
        int[] list = new int[128];
        for (char ch : s.toCharArray()) {
            list[ch]++;
        }

        boolean isOdd = false;
        int result = 0;

        for (int i = 0; i < 128; i++) {
            if (list[i] % 2 == 0) {
                result += list[i];
            } else {
                result += list[i]-1;
                isOdd = true;
            }
        }

        return isOdd ? result + 1 : result;
    }
}