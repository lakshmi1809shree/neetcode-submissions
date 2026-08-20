class Solution {
    public boolean isAnagram(String s, String t) {
        char[] x=s.toCharArray();
        Arrays.sort(x);
        char[] y=t.toCharArray();
        Arrays.sort(y);
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            if(y[i]!=x[i])return false;
        }
        return true;
    }
}
