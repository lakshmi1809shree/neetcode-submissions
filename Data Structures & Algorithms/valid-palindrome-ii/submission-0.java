class Solution {
    public boolean validPalindrome(String s) {
        if(isPalindrome(s))return true;

        for(int i=0;i<s.length();i++){
            String newS=s.substring(0,i)+s.substring(i+1);
            if(isPalindrome(newS))return true;
        }
        return false;
    }

    public boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
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