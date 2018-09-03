import java.util.*;

//        10
//        / \
//       5  15
//      / \   \
//     1   8   7

public class Main{

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    static int num = 0;

    public static void main(String[] args){
        TreeNode t1 = new TreeNode(1, null, null);
        TreeNode t8 = new TreeNode(8, null, null);
        TreeNode t7 = new TreeNode(7, null, null);
        TreeNode t5 = new TreeNode(5, t1, t8);
        TreeNode t15 = new TreeNode(15, null, t7);
        TreeNode t10 = new TreeNode(10, t5, t15);
        System.out.println(largestBSTSubtree(t10));
    }

    public static int largestBSTSubtree(TreeNode root) {
        helper(root);
        return num;
    }

    // in[] = {isBST, size, max, min};
    public static  int[] helper(TreeNode root) {
        if(root == null) return new int[]{1, 0, Integer.MIN_VALUE, Integer.MAX_VALUE};
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        int[] res = new int[4];
        res[2] = Math.max(root.val, right[2]);
        res[3] = Math.min(root.val, left[3]);
        // 这个node能构成一个Binary tree
        if(left[0] == 1 && right[0] == 1 && root.val > left[2] && root.val < right[3]) {
            res[0] = 1;
            res[1] = left[1] + right[1] + 1;
            num = Math.max(num, res[1]);
            return res;
        }
        // 这个node不能构成一个binary tree
        res[0] = 0;
        res[1] = Math.max(left[1], right[1]);
        return res;
    }

}
