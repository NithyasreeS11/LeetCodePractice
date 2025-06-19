class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String ch = tokens[i];
            if(!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/")){
                s.push(ch);
            }
            else{
                int a = Integer.parseInt(s.pop());
                int b = Integer.parseInt(s.pop());
                String c = "";
                if(ch.equals("+")){
                    c = Integer.toString(a+b);
                    s.push(c);
                    }
                else if(ch.equals("-")){
                     c = Integer.toString(b-a);
                     s.push(c);
                }
                else if(ch.equals("*")){
                    c = Integer.toString(a*b);
                    s.push(c);
                    }
                else if(ch.equals("/")){
                    c = Integer.toString(b/a);
                    s.push(c);
                }
            }
        }
        return (Integer.parseInt(s.pop()));
    }
}
