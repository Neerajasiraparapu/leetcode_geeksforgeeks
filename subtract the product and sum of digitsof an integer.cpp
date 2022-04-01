class Solution {
public:
    int subtractProductAndSum(int n) {
        int product=1,sum=0,rem,result;
        while(n){
            rem=n%10;
            product *= rem;
            sum += rem;
            n/=10;
            result=product-sum;
        }
        return result;
    }
};
