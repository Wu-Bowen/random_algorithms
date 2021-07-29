class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        res.add(Arrays.asList(root.val));
        Queue<TreeNode> q = new LinkedList<>();
        if(root.left != null){
            q.add(root.left);
        }
        if(root.right != null){
            q.add(root.right);
        }
        levelOrderHelper(q, res);
        return res;
    }
    public void levelOrderHelper(Queue<TreeNode> q, List<List<Integer>> res) {
        if(q.size() == 0) {
            return;
        }
        Queue<TreeNode> newQ = new LinkedList<>();
        List<Integer> temp = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            temp.add(node.val);
            if(node.left != null){
                newQ.offer(node.left);
            }
            if(node.right != null){
                newQ.offer(node.right);
            }
        }
        res.add(temp);
        levelOrderHelper(newQ, res);
    }
}