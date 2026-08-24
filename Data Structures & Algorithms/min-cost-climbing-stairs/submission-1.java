class Solution {
    int[] dp;
    private int solve(int[] cost,int i){
        if(i>=cost.length)return 0;
        if(dp[i]!=-1)return dp[i];
        int take=cost[i]+solve(cost,i+1);
        int skip=cost[i]+solve(cost,i+2);

        return dp[i]=Math.min(take,skip);

    }
    public int minCostClimbingStairs(int[] cost) {
        
        int n=cost.length;
        dp=new int[n];
        Arrays.fill(dp,-1);
       return Math.min(solve(cost,0),solve(cost,1));
    }
}
