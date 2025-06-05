class ValidParentheses {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int p = -1, a = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                p+=1;
                stack[p] = s.charAt(i);
                if(i==0){ a=1; }
            }
            else if(s.charAt(i)==')' && p!=-1){
                if(stack[p]=='('){
                    p-=1;
                }else{
                    break;
                }
            }
            else if(s.charAt(i)==']' && p!=-1){
                if(stack[p]=='['){
                    p-=1;
                }else{
                    break;
                }
            }
            else if(s.charAt(i)=='}' && p!=-1){
                if(stack[p]=='{'){
                    p-=1;
                }else{
                    break;
                }
            }
            else{
                a = 0;
            }
        }
        if(p==-1 && a==1){
            return true;
        }
        else{
            return false;
        }
        
    }
}
