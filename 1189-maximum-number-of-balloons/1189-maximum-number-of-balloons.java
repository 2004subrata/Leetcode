class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] list = new int[26];
        int[] need = new int[5];

        for (char ch : text.toCharArray()) {
            list[ch - 'a']++;
        }

        need[0] = list['b' - 'a'] / 1;
        need[1] = list['a' - 'a'] / 1;
        need[2] = list['l' - 'a'] / 2;
        need[3] = list['o' - 'a'] / 2;
        need[4] = list['n' - 'a'] / 1;

        Arrays.sort(need);
        return need[0];
    }
}