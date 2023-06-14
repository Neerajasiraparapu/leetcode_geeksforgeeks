class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] a=new int[2];
        int n=0,max=0,cnt=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    cnt++;
                }
            }
            if(max<cnt){
                max=cnt;
                n=i;
            }
            cnt=0;
        }
        a[0]=n;
        a[1]=max;
        return a;
    }
}