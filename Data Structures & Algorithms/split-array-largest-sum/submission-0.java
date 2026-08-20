class Solution {
    public boolean cansplit(int[] nums,int k ,int largest){
        int subarray=1,currsum=0;
        for(int num:nums){
            currsum+=num;
            if(currsum>largest){
                subarray++;
                if(subarray>k)return false;
                currsum=num;
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int l=0,r=0,res=0;
        for(int num:nums){
            l=Math.max(num,l);
            r+=num;
        }
        res=r;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(cansplit(nums,k,mid)){
                res=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }
}