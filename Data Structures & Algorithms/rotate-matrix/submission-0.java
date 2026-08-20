class Solution {
    public void reverse(int[][] matrix,int row){
        int m=matrix[0].length;
        int i=0,j=m-1;
        while(i<j){
            int temp=matrix[row][i];
            matrix[row][i]=matrix[row][j];
            matrix[row][j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                
            }
        }
        
        for(int i=0;i<n;i++){
            reverse(matrix,i);
        }
        

    }
}
