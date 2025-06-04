import java.util.ArrayList;
import java.util.List;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    
    TreeNode(int val) { 
        this.val = val; 
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) return result;
        dfs(root, "", result);
        return result;
    }

    private void dfs(TreeNode node, String path, List<String> result) {
        if (node == null) return;

        // If it's the first node, avoid adding '->' at start
        if (path.isEmpty()) {
            path += node.val;
        } else {
            path += "->" + node.val;
        }

        // If leaf node, add the full path to result
        if (node.left == null && node.right == null) {
            result.add(path);
        } else {
            dfs(node.left, path, result);
            dfs(node.right, path, result);
        }
    }

    // Test the solution
    public static void main(String[] args) {
        // Create test tree:
        //     1
        //    / \
        //   2   3
        //    \
        //     5
        TreeNode node5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2, null, node5);
        TreeNode node3 = new TreeNode(3);
        TreeNode root = new TreeNode(1, node2, node3);

        BinaryTreePaths solution = new BinaryTreePaths();
        List<String> paths = solution.binaryTreePaths(root);

        // Output: [1->2->5, 1->3]
        System.out.println(paths);
    }
}
