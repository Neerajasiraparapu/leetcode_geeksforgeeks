class Solution {
    public int findNumbers(int[] nums) {
        int cnt=0;
        
        for(int i=0;i<nums.length;i++){
                
            if(count(nums[i])%2==0){
                cnt+=1;
            }
        }
        return cnt;
    }
    public int count(int i){
        int c=0;
        while(i!=0){
            i/=10;
            c++;
        }
        return c;
    }
}