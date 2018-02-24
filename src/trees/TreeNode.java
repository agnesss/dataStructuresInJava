package trees;


import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by UserPC on 1/7/2018.
 */
public class  TreeNode {

    public String data;
    TreeNode left, right;
    boolean isVisited = false;

    TreeNode(String data) {
        this.data = data;
    }


    static void printTree(TreeNode root) {
        if(root != null) {
            System.out.println(root.data);

            if(root.left != null) {
                printTree(root.left);
            }

            if(root.right != null) {
                printTree(root.right);
            }
        }
    }

    public static void printTreeForLevel(TreeNode root) {
        if(root != null) {

            Queue<TreeNode> treeNodeQueue = new LinkedList<>();

            treeNodeQueue.add(root);

            while(!treeNodeQueue.isEmpty()) {
                TreeNode curr = treeNodeQueue.remove();

                if(curr.left != null) {
                    treeNodeQueue.add(curr.left);
                    System.out.println(curr.data + " with left child "+curr.left.data);
                }

                if(curr.right != null) {
                    treeNodeQueue.add(curr.right);
                    System.out.println(curr.data + " with right child "+ curr.right.data);
                }
            }
        }
    }
 }
