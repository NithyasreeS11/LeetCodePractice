class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] ans = new int[len];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<len;i++){
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                int prev = s.pop();
                ans[prev] =  i - prev;
            }
            s.push(i);
        }
        return ans;
    }
}
