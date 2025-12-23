class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String a = strs[0];
        String b = strs[strs.length-1];
        int len = 0;
        for(int i = 0;i<a.length();i++){
            if(a.charAt(i) == b.charAt(i))len++;
            else{
                break;
            }
        }
        return a.substring(0,len);
    }
}