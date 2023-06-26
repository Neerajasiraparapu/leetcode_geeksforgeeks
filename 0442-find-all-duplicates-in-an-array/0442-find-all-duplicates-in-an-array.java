class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> li=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
                li.add(i);
            }
            else{
                hm.put(i,1);
            }
        }
        return li;
    }
}