class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] hash = new int[26];

        int n = sentence.length();

        if(n < 26) return false;

        for(int i = 0; i<n; i++){
            hash[sentence.charAt(i) - 'a'] += 1;
        }
        
        for( int x : hash){
            if(x == 0) return false;
        }
        return true;
    }
}