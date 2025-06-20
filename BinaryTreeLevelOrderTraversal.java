class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int lsize = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<lsize;i++){
                TreeNode n = q.poll();
                l.add(n.val);
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
            }
            res.add(l);
        }
        return res;
    }
}
