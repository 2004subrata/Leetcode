class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        if (n == 1)
            return mat[0][0];

        int left = 0;
        int right = n - 1;
        while (left < right) {
            sum += mat[left][left] + mat[left][right] + mat[right][left] + mat[right][right];
            left += 1;
            right -= 1;
        }

        if (left == right) {
            sum += mat[left][left];
        }

        return sum;
    }
}