//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            int[] ans = ob.changeBits(N);
            System.out.println(ans[0]+ " "+ ans[1]);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int[] changeBits(int N) {
        // code here
        int temp=N;
        int l=0;
        
        while(temp!=0){
            l++;
            temp=temp>>1;
        }
        int x=1<<l;
        int a[]=new int[2];
        a[0]=(x-1)-N;
        a[1]=x-1;
        return a;
    }
};