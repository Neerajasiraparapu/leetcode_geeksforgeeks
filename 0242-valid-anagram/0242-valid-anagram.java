class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch=new char[s.length()];
        char[] ch1=new char[t.length()];
        for(int i=0;i<s.length();i++){
            ch[i]=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            ch1[i]=t.charAt(i);
        }
        Arrays.sort(ch);
        Arrays.sort(ch1);
        if(ch.length!=ch1.length){
            return false;
        }
        for(int i=0;i<ch.length;i++){
            if(ch[i]==ch1[i]){
                continue;
            }
            else{
                
                return false;
            }
        }
        return true;
    }
}