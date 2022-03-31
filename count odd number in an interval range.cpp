//i have written in two programs 

class Solution {
public:
    int countOdds(int low, int high) {
     int count=(high-low)/2;
        if(high%2!=0||low%2!=0)
            count++;
            
      return count;    
    }
};







class Solution {
public:
    int countOdds(int low, int high) {
     int count=(high-low)/2;
        if(high%2!=0)
            count++;
        else if(low%2!=0)
            count++;
            
      return count;    
    }
};
