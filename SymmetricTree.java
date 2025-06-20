class Solution {
    public boolean mirror(TreeNode t1, TreeNode t2){
        if(t1==null && t2==null) return true;
        if(t1==null || t2==null) return false;
        if(t1.val!=t2.val) return false;
        return(mirror(t1.left,t2.right) && mirror(t1.right,t2.left));
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return mirror(root.left,root.right);
    }
}
