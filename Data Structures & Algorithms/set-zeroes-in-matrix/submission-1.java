class Solution {
    /*
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
    */
    public void setZeroes(int[][] matrix) {
        // iterate over the matrix and get all rows in which we h
        // have zeos 
        // make those row zero in original 
        /*
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
        */

        /// now what we will do we will use hash array to store value col
        // and rows where zero is present 
        // then reiteraye over the matrix and fill if zero is presnet 
        // in any of them 

        int n=matrix.length,m=matrix[0].length;
        boolean[] rowzero=new boolean[n];
        boolean[] colzero=new boolean[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    rowzero[i]=true;
                    colzero[j]=true;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(rowzero[i] || colzero[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
