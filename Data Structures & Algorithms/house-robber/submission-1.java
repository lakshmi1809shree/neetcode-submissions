class Solution {
    int[] dp;
    private int solve(int[] nums,int i){
        if(i>=nums.length)return 0;
        if(dp[i]!=-1)return dp[i];;
        int take=nums[i]+solve(nums,i+2);
        int skip=solve(nums,i+1);

        return dp[i]=Math.max(take,skip);
    }
    public int rob(int[] nums) {
        // nums[1,1,3,3]
        // 
        dp=new int[nums.length+1];
        Arrays.fill(dp,-1);

        return solve(nums,0);
    }
}
