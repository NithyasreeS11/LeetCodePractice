class ReverseWordsInString {
    public String reverseWords(String s) {
        String[] ss = s.split("\\s+");
        for(int i=0;i<ss.length/2;i++){
            String temp = ss[i];
            ss[i] = ss[ss.length-i-1];
            ss[ss.length-i-1] = temp;
        }
        String ans = String.join(" ",ss).trim();
        return ans;
    }
}
