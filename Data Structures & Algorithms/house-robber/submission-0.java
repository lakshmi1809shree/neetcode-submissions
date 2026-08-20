class Solution {
    public int dfs(int[] nums,int i,int[] dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        return dp[i]=Math.max(nums[i]+dfs(nums,i+2,dp),dfs(nums,i+1,dp));

       
    }
    public int rob(int[] nums) {
        
        int i=0;
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
       
        return  dfs(nums,0,dp);
    }
}
