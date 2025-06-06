class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n<1) return false;
        int ans = n & n-1 ;
        if(ans==0) return true;
        else return false; 
    }
}
