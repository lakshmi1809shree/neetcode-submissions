class Solution {
    public int mySqrt(int x) {
        // 1 to x 
        //
        int low=1,high=x;
        while(low<=high){
            int mid=(low)+(high-low)/2;
            long square=(long)mid*mid;
            if(square==(long)x){
                return mid;
            }else if(square>(long)x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        } 
        return Math.round(high);
    }
}