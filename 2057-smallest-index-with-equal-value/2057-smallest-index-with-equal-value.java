class Solution {
    public int smallestEqual(int[] nums) {
        int ind=-1;
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                ind=i;
                break;
            }
        }
        return ind;
    }
}