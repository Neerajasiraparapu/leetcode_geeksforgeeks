class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int min=nums[0];
        int max=nums[n-1];
        int gcd=1;
        for(int i=2;i<=min;i++){
            if((min%i)==0 && (max%i)==0){
                if(gcd<i){
                    gcd=i;
                }
            }
        }
        return gcd;
    }
}