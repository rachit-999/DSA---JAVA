class Solution {
    public int maxProduct(int[] nums) {
        int currmax = nums[0];
        int currmin  = nums[0];
        int ans = nums[0];

        for(int i = 1;i < nums.length;i++) {
            int tempmax = currmax;
            int tempmin = currmin;

            currmax = Math.max(nums[i],Math.max(tempmax * nums[i],tempmin * nums[i]));
            currmin = Math.min(nums[i],Math.min(tempmax * nums[i],tempmin * nums[i]));

            ans = Math.max(currmax,ans);
        }
        return ans;
    }
}