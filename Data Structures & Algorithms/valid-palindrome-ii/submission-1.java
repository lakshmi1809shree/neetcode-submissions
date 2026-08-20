class Solution {
    public boolean validPalindrome(String s) {
        int l=0,r=s.length()-1;

        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return isPalindrome(s,l+1,r) || isPalindrome(s,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }
    // aaabbbaaac

    public boolean isPalindrome(String s,int l,int r){
        int i=l;
        int j=r;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}