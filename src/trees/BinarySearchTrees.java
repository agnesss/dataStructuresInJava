package trees;

/**
 * Created by UserPC on 2/21/2018.
 */
public class BinarySearchTrees {



    static  void addNodeToTree(TreeNode root, TreeNode node ) {
        if(root != null) {
            if(Integer.parseInt(node.data) < Integer.parseInt(root.data)) {
                if(root.left == null) {
                    root.left = node;
                } else {
                    addNodeToTree(root.left, node);
                }
            } else {
                if(root.right == null) {
                    root.right = node;
                } else {
                    addNodeToTree(root.right, node);
                }
            }
        }
    }

    static boolean searchNode(TreeNode root, TreeNode node) {
        if(root != null) {
            if(root.data.equals(node.data)) {
                System.out.println("gasit elem!");
                return true;
            }

            if(Integer.parseInt(node.data) < Integer.parseInt(root.data)) {
                return searchNode(root.left, node);
            } else {
                return searchNode(root.right, node);
            }
        }
        return false;
    }


    static void removeNode(TreeNode root, TreeNode node) throws Exception {
        if(root.data.equals(node.data)) throw new Exception("Cannot remove root");

        if(root == null) return;

        if(Integer.parseInt(root.data) > Integer.parseInt(node.data)) {
            if(root.left != null && root.left.data.equals(node.data)) {
                System.out.println("Remove element "+ node.data);
                TreeNode current = root.left;
                root.left = current.left;
                if(current.left != null) {
                    current.left.right = current.right;
                }
            } else removeNode(root.left, node);
        } else {
            if(root.right != null && root.right.data.equals(node.data)) {
                System.out.println("Remove element "+ node.data);
                TreeNode current = root.right;
                root.right = current.right;
                if(current.right != null) {
                    current.right.left = current.left;
                }
            }
            else removeNode(root.right, node);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode("50");

        addNodeToTree(root, new TreeNode("76"));
        addNodeToTree(root, new TreeNode("21"));
        addNodeToTree(root, new TreeNode("4"));
        addNodeToTree(root, new TreeNode("32"));
        addNodeToTree(root, new TreeNode("100"));
        addNodeToTree(root, new TreeNode("64"));
        addNodeToTree(root, new TreeNode("52"));

        Traversals.inOrderTraversal(root);

        searchNode(root, new TreeNode("64"));

        try {
            removeNode(root, new TreeNode("76"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Traversals.inOrderTraversal(root);
    }


}
