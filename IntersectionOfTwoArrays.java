class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> ans = new HashSet<>();
        int k = 0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ans.add(nums1[i]);
                    break;
                }
            }
        }
        int[] res = new int[ans.size()];
        for(Integer a : ans){
            res[k] = a;
            k++;
        }
        return res;
        
    }
}
