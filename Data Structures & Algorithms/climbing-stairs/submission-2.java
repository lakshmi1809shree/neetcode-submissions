class Solution {
    int[] dp;

    private int solve(int n){
        if(n==0||n==1)return 1;
        if(dp[n]!=-1)return dp[n];
        int onestep=solve(n-1);
        int twostep=solve(n-2);

        return dp[n]=onestep+twostep;
    }
    public int climbStairs(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n);
    }
}
