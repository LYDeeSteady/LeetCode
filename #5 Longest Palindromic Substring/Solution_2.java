public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 0)return "^$";
        StringBuilder stringBuilder = new StringBuilder("^");
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append("#"+s.charAt(i));
        }
        stringBuilder.append("#$");
        
        
        
        String trans = stringBuilder.toString();
        final int n = trans.length();
        int P[] = new int[n];
        int C=0,R=0;
        for (int i = 1; i < n-1; i++) {
            int iMirror = 2*C - i;
            P[i] = (R > i) ? Math.min(R - i,P[iMirror]) : 0;
            while(trans.charAt(i+1+P[i]) == trans.charAt(i-1-P[i])){
                P[i]++;
            }
            if (i+P[i] > R){
                C = i;
                R = i+P[i];
            }
        }

        int maxLen = 0;
        int centerIndex = 0;
        for (int i = 1; i < n-1; i++) {
            if (P[i] > maxLen){
                maxLen = P[i];
                centerIndex = i;
            }
        }

        final int start = (centerIndex-1-maxLen) / 2;
        return s.substring(start,start+maxLen);
    }
    
}