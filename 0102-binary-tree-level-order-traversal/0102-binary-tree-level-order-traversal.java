
class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    private void dfs(TreeNode root, int depth){
        if(root == null){
            return;
        }

        if(res.size() == depth){
            res.add(new ArrayList<>());
        }

        res.get(depth).add(root.val);
        dfs(root.left, depth+1);
        dfs(root.right, depth+1);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        dfs(root,0);
        return res;
    }
}