class Solution {
    public boolean canEatinTime(int[] piles,int k ,int h){
        long hours=0;
        for(int pile:piles){
            int div=pile/k;
            hours+=(long)div;
            if(pile%k!=0) hours++;
        }
        return hours<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int minimum=1;
        int maximum=1000000000;
        // so now we have the range 
        int low=minimum,high=maximum;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canEatinTime(piles,mid,h))high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}
