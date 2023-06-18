class Solution {
    public char repeatedCharacter(String s) {
        char c=' ';
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                c=s.charAt(i);
                break;
            }
            hm.put(s.charAt(i),i);
        }
        return c;
    }
}