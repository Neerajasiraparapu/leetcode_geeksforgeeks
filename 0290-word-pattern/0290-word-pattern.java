class Solution {
    public boolean wordPattern(String pattern, String s) {
        String str[]=s.split(" ");
        List<Character> li=new ArrayList<>();
        List<String> list=new ArrayList<>();
        if(pattern.length()!=str.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            if(!li.contains(pattern.charAt(i)) && !list.contains(str[i])){
                li.add(pattern.charAt(i));
                
                    list.add(str[i]);
            }
             else if(!li.contains(pattern.charAt(i))&& list.contains(str[i])){
                    return false;
            }
            
            else{
                int ind=li.indexOf(pattern.charAt(i));
                if(!list.get(ind).equals(str[i])){
                    return false;
                }
            }
        }
        return true;
    }
}