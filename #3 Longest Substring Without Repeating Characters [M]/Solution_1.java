class Solution { 
    public int lengthOfLongestSubstring(String s) { 
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j = j+1;
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i));
                i = i+1;
            }
        }
        return ans;
    }
}