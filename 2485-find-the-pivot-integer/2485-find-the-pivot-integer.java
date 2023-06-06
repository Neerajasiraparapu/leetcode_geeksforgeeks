class Solution {
    public int pivotInteger(int n) {
        if(n==1)return 1;
        int sum=(n*(n+1))/2;
        int sr=0;
        for(int i=1;i<n;i++){
            sr+=i;
            if(sum-sr+i==sr){
                return i;
            }
        }
        return -1;
    }
}