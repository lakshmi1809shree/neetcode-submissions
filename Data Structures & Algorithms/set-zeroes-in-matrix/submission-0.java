class Solution {
    public void makerowzero(int[][] matrix,int row){
        for(int i=0;i<matrix[0].length;i++){
            matrix[row][i]=0;
        }
    }
    public void makecolzero(int[][] matrix,int col){
        for(int i=0;i<matrix.length;i++){
            matrix[i][col]=0;
        }
    }
    public void setZeroes(int[][] matrix) {
        // iterate over the matrix and get all rows in which we h
        // have zeos 
        // make those row zero in original 
        List<int[]> orginal=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    orginal.add(new int[]{i,j});
                }
            }
        }
        for(int[] pos:orginal){
            makerowzero(matrix,pos[0]);
            makecolzero(matrix,pos[1]);
        }
    }
}
