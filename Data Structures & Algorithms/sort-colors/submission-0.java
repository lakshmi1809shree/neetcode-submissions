class Solution {
    public void sortColors(int[] nums) {
        int countzero=0;
        int countone=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)countzero++;
            if(nums[i]==1)countone++;
        }
        for(int i=0;i<countzero;i++){
            nums[i]=0;
        }
        for(int i=countzero;i<countzero+countone;i++)nums[i]=1;
        for(int i=countone+countzero;i<nums.length;i++)nums[i]=2;
    }
}