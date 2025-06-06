class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> ls = new ArrayList<>();
            if(i==0){
                ls.add(1);
                ans.add(ls);
            }
            else if(i==1){
                ls.add(1);
                ls.add(1);
                ans.add(ls);
            }
            else{
                ls.add(1);
                for(int j=1;j<i;j++){
                    ls.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
                }
                ls.add(1);
                ans.add(ls);
            }
        }
        return ans;
    }
}
