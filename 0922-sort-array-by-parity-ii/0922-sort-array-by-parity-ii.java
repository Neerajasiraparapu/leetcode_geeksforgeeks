class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int arr[]=new int[nums.length];
        int j=0;
        int a=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(j%2==0){
                    arr[j]=nums[i];
                    j+=2;
                }
                
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                if(a%2!=0){
                    arr[a]=nums[i];
                    a+=2;
                }
            }
        }
        return arr;
    }
}