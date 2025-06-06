class IndexOfFirstOccurenceInString {
    public int strStr(String haystack, String needle) {
        int p = -1;
        char ch = needle.charAt(0);
        for(int i=0;i<haystack.length();i++){
            if(ch == haystack.charAt(i)){
                p = i;
                if(i+needle.length()>haystack.length()){ return -1;}
                for(int j=0;j<needle.length() && (j+i)<haystack.length();j++){
                    if(needle.charAt(j)!=haystack.charAt(j+i)){
                        p = -1;
                        break;
                    }
                }
            }
            if(p!=-1) break;
        }
        return p;
    }
}
