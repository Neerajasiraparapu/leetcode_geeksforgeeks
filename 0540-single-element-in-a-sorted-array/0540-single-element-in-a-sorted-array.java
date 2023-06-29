class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int a:nums){
            if(hm.containsKey(a)){
                hm.put(a,hm.get(a)+1);
            }else{
                hm.put(a,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }
}