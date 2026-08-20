class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[n];

        for(int i=n-1;i>=0;i--){
            //int count=0;
            while(!st.isEmpty()  && temperatures[st.peek()]<=temperatures[i]){
                st.pop();
                //count++;
            }
            if(!st.isEmpty()){
                ans[i]=st.peek()-i;
            }else{
                ans[i]=0;
            }
            st.push(i);
        }
        return ans;
    }
}
