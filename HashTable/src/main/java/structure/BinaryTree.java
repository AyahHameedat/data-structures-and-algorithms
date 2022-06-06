package structure;


import data.BTNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree<T extends Comparable<T>> {

    private BTNode root;
    List BTList = new ArrayList<>();

    public enum TraversalOrder {
        INORDER,
        PREORDER,
        POSTORDER
    }

    public BTNode getRoot() {
        return root;
    }

    public void setRoot(BTNode root) {
        this.root = root;
    }

    public List traverse(BinaryTree.TraversalOrder order) {
        switch (order) {
            case INORDER:
                inOrder(root);
                break;
            case PREORDER:
                preOrder(root);
                break;
            case POSTORDER:
                postOrder(root);
                break;
            default:
                System.out.println("Hello");
        }
        return BTList;
    }


    private List inOrder(BTNode treeNode) {
        if (treeNode == null) { // base case
            return BTList;
        }


        inOrder(treeNode.getLeft()); // left

        BTList.add(treeNode.getData());

        printNode(treeNode); // root

        inOrder(treeNode.getRight()); // right



        return BTList;
    }

    List preOrder(BTNode treeNode) {
        if (treeNode == null) {
            return BTList;
        }

        printNode(treeNode);

        BTList.add(treeNode.getData());

        preOrder(treeNode.getLeft());

        preOrder(treeNode.getRight());


        return BTList;
    }

    private List postOrder(BTNode treeNode) {
        if (treeNode == null) {
            return BTList;
        }

        postOrder(treeNode.getLeft());

        postOrder(treeNode.getRight());

        BTList.add(treeNode.getData());

        printNode(treeNode);

        return BTList;

    }

    private void printNode(BTNode node) {
        // implement this
        System.out.println(node.getData());
    }


}