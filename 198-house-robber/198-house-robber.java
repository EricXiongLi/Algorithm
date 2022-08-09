class Solution {
    public int rob(int[] nums) {
        //dp[i]: when robbing the ith house, the max quantity
        //dp[i] = max(dp[i - 1], dp[i - 2] + nums[i])
        int[] dp = new int[nums.length];
        if (nums.length == 1) {
            return nums[0];
        }
        dp[0] = nums[0];
        dp[1] = nums[1] >= nums[0] ? nums[1] : nums[0];
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[nums.length - 1];
    }
}