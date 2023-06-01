class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> hs=new HashSet<>();
        List<Integer> arr=new ArrayList<>();
        for(int i:nums1){
            hs.add(i);
        }
        for(int j:nums2){
            if(hs.contains(j)){
                arr.add(j);
                hs.remove(j);
            }
        }
        int []a=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            a[i]=arr.get(i);
        }
        return a;
    }
}