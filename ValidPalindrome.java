class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuffer ss = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') ||(s.charAt(i)<='9' && s.charAt(i)>='0')){
                ss.append(s.charAt(i));
            }
        }
        StringBuffer rev = new StringBuffer(ss).reverse();
        if(ss.toString().equals(rev.toString())){
            return true;
        }
        else{
            return false;
        }
    }
}
