class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int colstart=0;
        int colend=n-1;
        int rowstart=0;
        int rowend=m-1;
        List<Integer> ans=new ArrayList<>();
        while(colstart<=colend && rowstart<=rowend){
            //row fixed at rowstart ,
            for(int i=colstart;i<=colend;i++){
                ans.add(matrix[rowstart][i]);
            }
            rowstart++;
            // col end is fixed 
            for(int i=rowstart;i<=rowend;i++){
                ans.add(matrix[i][colend]);
            }
            colend--;

            if(rowstart<=rowend){
                for(int i=colend;i>=colstart;i--){
                    ans.add(matrix[rowend][i]);
                }
                rowend--;
            }
            if(colstart<=colend){
                for(int i=rowend;i>=rowstart;i--){
                    ans.add(matrix[i][colstart]);
                }
                colstart++;
            }


        }
        return ans;
    }
}
