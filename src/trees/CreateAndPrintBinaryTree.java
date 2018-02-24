package trees;


import sun.reflect.generics.tree.Tree;

import java.util.Stack;

/**
 * Created by UserPC on 1/7/2018.
 */
public class CreateAndPrintBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode("a");

        TreeNode child1 = new TreeNode("b");
        TreeNode child2 = new TreeNode("c");
        TreeNode child3 = new TreeNode("d");
        TreeNode child4 = new TreeNode("e");
        TreeNode child5 = new TreeNode("f");
        TreeNode child6 = new TreeNode("g");
        TreeNode child7 = new TreeNode("h");
        TreeNode child8 = new TreeNode("i");
        TreeNode child9 = new TreeNode("x");
        TreeNode child10 = new TreeNode("y");
        TreeNode child11 = new TreeNode("v");
        TreeNode child12 = new TreeNode("w");
        TreeNode child13 = new TreeNode("q");

        root.left = child1;
        root.right = child2;

        child1.left = child3;
        child1.right = child4;

        child2.left = child5;
        child2.right = child6;

        child3.left = child7;
        child3.right =  child8;

        child4.left = child11;
        child4.right = child12;

        child5.left = child9;
        child5.right = child10;

        child6.left = child13;


        //TreeNode.printTree(root);

        //TreeNode.printTreeForLevel(root);

        Traversals.postOrderTraversal(root);

    }
}
