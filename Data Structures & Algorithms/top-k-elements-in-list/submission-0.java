class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        List<Integer> keys=new ArrayList<>(mp.keySet());
        keys.sort((a,b)->mp.get(b)-mp.get(a));

        for(int i=0;i<k;i++){
            ans.add(keys.get(i));
        }

        int[] res=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}
