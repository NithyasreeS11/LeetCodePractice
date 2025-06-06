class ReverseInteger {
    public int reverse(int x) {
        boolean flag = false;
        if(x<0) {
            x = x*(-1);
            flag = true;
        }
        long rev = 0;
        while(x>0){
            rev = rev * 10 + ( x % 10);
            x=x/10;
        }
        if(flag) rev = -1 * rev;
        if(rev > 2147483647 || rev < -2147483648) return 0;
        int ans = (int) rev;
        return ans;
    }
}
