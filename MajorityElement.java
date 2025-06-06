class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int max = 0, mc = 0;
        int cmax = nums[0], cc = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==cmax){
                cc = cc + 1;
            }else{
                if(cc > mc){
                    max = cmax;
                    mc = cc;
                    cmax = nums[i];
                    cc = 1;
                }
                else{
                    cc = 1;
                    cmax = nums[i];
                }
            }
        }
        if(cc > mc){
            return cmax;
        }
        else{
            return max;
        }
    }
}
