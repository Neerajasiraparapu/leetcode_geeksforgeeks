class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int []mat=new int[matrix.length*matrix[0].length];
        int s=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                mat[s++]=matrix[i][j];
            }
        }
        Arrays.sort(mat);
        return mat[k-1];
    }
}