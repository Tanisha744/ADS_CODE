class TreeNode { 
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Problem100 {  

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode tree2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        Problem100 solution = new Problem100();
        boolean result = solution.isSameTree(tree1, tree2);
        System.out.println("The trees are the same: " + result);
    }
}
