class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minWeight=0;
        int maxWeight=0;

        for(int i=0;i<weights.length;i++){
            minWeight=Math.max(weights[i],minWeight);
            maxWeight+=weights[i];
        }

        int low=minWeight;
        int high=maxWeight;

        while(low<=high){
            int mid=low+(high-low)/2;
            int day=1;
            int currweight=0;
            for(var weight:weights){
                if(currweight+weight>mid){
                    //System.out.println(currweight);
                    day++;
                    currweight=0;
                }
                currweight+=weight;
            }
            if(day<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}