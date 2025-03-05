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

public class Problem112 {  

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }

        if(root.left == null && root.right == null && targetSum - root.val == 0){
            return true;
        }

        targetSum -= root.val;
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(5, 
            new TreeNode(4, 
                new TreeNode(11, 
                    new TreeNode(7), 
                    new TreeNode(2)
                ), 
                null
            ), 
            new TreeNode(8, 
                new TreeNode(13), 
                new TreeNode(4, null, new TreeNode(1))
            )
        );

        int targetSum = 22;

        Problem112 solution = new Problem112();
        boolean result = solution.hasPathSum(tree, targetSum);
        System.out.println("The tree has a path sum: " + result);
    }
}
