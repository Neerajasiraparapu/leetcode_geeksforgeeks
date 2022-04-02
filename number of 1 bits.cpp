class Solution {
public:
    int hammingWeight(uint32_t n) {
      unsigned int set_bits=0;  
      while(n){
          if(n&1){
          set_bits++;    
          }
          n=n>>1;
      }
        return set_bits;
    }
};
