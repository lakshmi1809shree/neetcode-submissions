class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int high=0;
        int n=s.length();

        HashSet<Character> charset=new HashSet<>();
        int maxlength=0;
        while(low<n && high<n){
            while(charset.contains(s.charAt(high))){
                charset.remove(s.charAt(low));
                low++;
            }
            if(!charset.contains(s.charAt(high))){
                charset.add(s.charAt(high));
                maxlength=Math.max(maxlength,high-low+1);
                high++;
            }
        }
        return maxlength;
    }
}
