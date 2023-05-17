class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int size=nums.length;
        int arr[]=new int[size];
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if(nums[i]>nums[j]){
                        cnt++;
                    }
                }
            }
            arr[i]=cnt;
            cnt=0;
        }
        return arr;
    }
}