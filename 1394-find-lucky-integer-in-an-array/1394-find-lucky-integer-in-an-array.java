class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        int l=-1;
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getKey()==entry.getValue()){
                l=entry.getKey();
            }
        }
        return l;
    }
}