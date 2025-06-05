class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            int x = (int) s.charAt(i) - 97;
            arr[x] = arr[x]+1;
        }
        for(int i=0;i<t.length();i++){
            int x = (int) t.charAt(i) - 97;
            arr[x] = arr[x]-1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
        
    }
}
