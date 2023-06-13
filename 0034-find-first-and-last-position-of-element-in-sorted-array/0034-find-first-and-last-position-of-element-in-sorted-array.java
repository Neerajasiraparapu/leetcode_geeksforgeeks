class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] se=new int[2];
        se[0]=-1;
        se[1]=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                se[0]=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                se[1]=i;
                break;
            }
        }
        return se;
    }
}