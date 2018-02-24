package trees;

/**
 * Created by UserPC on 1/7/2018.
 */
public class Traversals {

    static void inOrderTraversal(TreeNode root) {
        if(root != null) {
            inOrderTraversal(root.left);

            System.out.println(root.data);

            inOrderTraversal(root.right);
        }
    }

    static void preOrderTraversal(TreeNode root) {

        if(root != null) {
            System.out.println(root.data);

            preOrderTraversal(root.left);

            preOrderTraversal(root.right);
        }
    }

    static void postOrderTraversal(TreeNode root) {
        if(root != null) {

            postOrderTraversal(root.left);

            postOrderTraversal(root.right);

            System.out.println(root.data);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode("a");

        TreeNode child1 = new TreeNode("b");
        TreeNode child2 = new TreeNode("c");
        TreeNode child3 = new TreeNode("d");
        TreeNode child4 = new TreeNode("e");
        TreeNode child5 = new TreeNode("f");

        root.left = child1;
        root.right = child2;

        child1.left = child3;
        child1.right = child4;

        child2.left = child5;

        //inOrderTraversal(root);

        //preOrderTraversal(root);

        postOrderTraversal(root);
    }
}
