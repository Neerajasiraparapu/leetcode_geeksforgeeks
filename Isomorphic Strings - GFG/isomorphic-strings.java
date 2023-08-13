//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

// } Driver Code Ends


class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        List<Character> li=new ArrayList<>();
        List<Character> list=new ArrayList<>();
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            if(!li.contains(str1.charAt(i))&&(!list.contains(str2.charAt(i)))){
                li.add(str1.charAt(i));
                list.add(str2.charAt(i));
            }
            else if(!li.contains(str1.charAt(i))&& (list.contains(str2.charAt(i)))){
                return false;
            }
            else{
                int ind=li.indexOf(str1.charAt(i));
                if(list.get(ind)!=str2.charAt(i)){
                    return false;
                }
            }
        }
        return true;
        
    }
}