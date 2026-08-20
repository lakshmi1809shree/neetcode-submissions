class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        StringBuilder s=new StringBuilder();
        int i=0;
        while(i<Math.min(n1,n2)){
            s.append(word1.charAt(i));
            s.append(word2.charAt(i));
            i++;
        }
        if(i<n1)s.append(word1.substring(i));
        if(i<n2)s.append(word2.substring(i));
        return s.toString();
    }
}