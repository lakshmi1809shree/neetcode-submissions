class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /// find the row where target can be 

        int n=matrix.length;
        int m=matrix[0].length;
        int first=0,last=m-1;
        int i=0;
        int row=-1;
        for(;i<n;i++){
            if(target >= matrix[i][first] && target <= matrix[i][last]){
                row=i;
                break;
            }
        }   
        if (row == -1) return false;
        //int row=i;
        //nums[i][0],nums[i][m-1]; is our range
        int low=0;
        int high=m-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(matrix[row][mid]==target)return true;
            else if(matrix[row][mid]>target)high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}
