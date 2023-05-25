class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)return 1;
        int l=0;
        int t=n;
        
       while(n!=0){
           l++;
           n=n>>1;
       }
        int x=1<<l;
        x=x-1;
        return t^x;
    }
}