class Solution {
    public boolean checkDivisibility(int n) {
        int original = n, sum = 0, mul = 1;

        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            mul *= lastDigit;
            n /= 10;
        }

        return original % (sum + mul) == 0;

    }
}