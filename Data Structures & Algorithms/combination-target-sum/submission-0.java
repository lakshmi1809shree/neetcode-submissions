class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void solve(int[] nums,int i,int target,int sum,List<Integer>currlist){
        if(sum==target){
            ans.add(new ArrayList<>(currlist));
            return;
        }
        if(sum>target || i>=nums.length){
            return;
            //sum+=nums[i];
        }
        currlist.add(nums[i]);
        solve(nums,i,target,sum+nums[i],currlist);
        currlist.remove(currlist.size()-1);
        solve(nums,i+1,target,sum,currlist);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        int sum=0;
        //List<List<Integer>> ans=new ArrayList<>();
        List<Integer> currlist=new ArrayList<>();

        solve(nums,0,target,0,currlist);
        return ans;
    }
}
