class MissingNumber {
    public int missingNumber(int[] nums) {
        int min = nums[0], max = nums[0];
        int arrsum = 0, sum = 0;
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            arrsum+=nums[i];
            if(nums[i]==0){
                flag = true;
            }
            if(nums[i]>max){
                max = nums[i];
            }
            else if(nums[i]<min){
                min = nums[i];
            }
        }
        for(int i=min;i<=max;i++){
            sum+=i;
        }
        if(sum-arrsum != 0){
            return (sum-arrsum);
        }
        else if(sum-arrsum==0 & flag){
            return max+1;
        }
        else{
            return 0;
        }
    }
}
