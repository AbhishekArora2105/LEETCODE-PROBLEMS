class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> sb = new HashSet<>();
        int l = 0;
        int maxLen = 0;

        for(int i = 0;i<s.length();i++){
            while(sb.contains(s.charAt(i))){
                sb.remove(s.charAt(l));
                l++;
            }
            sb.add(s.charAt(i));
            maxLen = Math.max(maxLen,i-l+1);
        }
        return maxLen;
    }
}