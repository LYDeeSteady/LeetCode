class Solution { 
    public int lengthOfLongestSubstring(String s) { 
        int n = s.length();
        int ans = 0 , i = 0;
        int ascll[] = new int[128];
        for(int j=0;j<n;j++){
            i = Math.max(ascll[s.charAt(j)],i);
            ans = Math.max(ans,j-i+1);
            ascll[s.charAt(j)] = j+1;
        }
        return ans;
    }
}