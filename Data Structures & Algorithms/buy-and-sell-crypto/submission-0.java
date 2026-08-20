class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] prefix=new int[n];

        prefix[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            int max=Math.max(prefix[i+1],prices[i+1]);
            if(max>prices[i]){
                prefix[i]=max;
            }else{
                prefix[i]=-1;
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(prefix[i]>=0){
                ans=Math.max(ans,prefix[i]-prices[i]);
            }
        }
        return ans;
    }
}
