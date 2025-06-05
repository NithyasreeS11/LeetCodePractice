class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        Arrays.sort(strs);
        String a = strs[0], b = strs[strs.length-1];
        int len = a.length() < b.length() ? a.length() : b.length();
        for(int i=0;i<len;i++){
            if(a.charAt(i)!=b.charAt(i)){
                return ans;
            }
            ans = ans + a.charAt(i);
        }
        return ans;  
    }
}
