class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int j=1,se=0;
        for(int i=nums.length-1;i>=0;i--){
            if(j==k){
                se=nums[i];
            }
            j++;
        }
        return se;
    }
}