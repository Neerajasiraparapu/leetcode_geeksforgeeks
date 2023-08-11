class Solution {
    public int mostWordsFound(String[] sentences) {
        int cnt=0;
        int wordcnt=0;
        for(int i=0;i<sentences.length;i++){
            String s=sentences[i];
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==' '){
                    wordcnt++;
                }
            }
            if(wordcnt>cnt){
                cnt=wordcnt;
            }
            wordcnt=0;
        }
        return cnt+1;
    }
}