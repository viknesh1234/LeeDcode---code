// Main.java

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class SortedArraytoBinaryTree {

    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};

        Solution solution = new Solution();
        TreeNode root = solution.sortedArrayToBST(nums);

        System.out.println("Inorder Traversal of BST:");
        inorderTraversal(root);
    }

    // Helper method to print BST inorder (for verification)
    static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }
}

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = helper(nums, left, mid - 1);
        node.right = helper(nums, mid + 1, right);

        return node;
    }
}
