class Solution {
public:
    double average(vector<int>& salary) { 
         double min=salary[0],max=0,sum=0;
       
       int x=salary.size();
        for(int i=0;i<x;i++)
        {
            if(min>salary[i]){
                min=salary[i];
            }
                if(max<salary[i]){
                max=salary[i];
            }
            sum=sum+salary[i];
        }
        return (sum-min-max)/(x-2); 
    }
};
        
        
        
