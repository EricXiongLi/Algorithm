class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int ans = 0;
        for (int val : count) {
            ans += val / 2 * 2;
            if (val % 2 == 1 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
}