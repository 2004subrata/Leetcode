class Solution {

    public boolean isPalindrome(String s) {
        // first convert into lowercase and remove all the special charecters and spaces.
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return check(0, s);
    }

    public boolean check(int i, String str) {
        if (i >= str.length() - i - 1)
            return true;
        // check 1st & last charecter same or not.
        if (str.charAt(i) != str.charAt(str.length() - i - 1))
            return false;
        return check(i+1, str);
    }

}