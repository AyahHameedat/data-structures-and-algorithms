package class10.dsa.tree.structure;


import class10.dsa.queue.structure.queue;
import class10.dsa.tree.data.BTNode;

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

    private List preOrder(BTNode treeNode) {
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


    public List levelOrderTraversalLoop()
    {
        Queue<BTNode> queue = new LinkedList<BTNode>();
        queue.add(root);
        while (!queue.isEmpty()) {

            BTNode tempNode = queue.poll();
            System.out.print(tempNode.getData() + " ");
            BTList.add(tempNode.getData());

            /* Enqueue left child */
            if (tempNode.getLeft() != null) {
                queue.add(tempNode.getLeft());
            }

            /* Enqueue right child */
            if (tempNode.getRight() != null) {
                queue.add(tempNode.getRight());
            }
        }
        return BTList;
    }

        public void levelOrderTraversalRecursive() {
            if (root != null) {
                queue<BTNode> queue = new queue<>();
                queue.enqueue(String.valueOf(root));
                levelOrderTraversalRecursive(queue);
            } else {
                System.out.println("Tree is empty");
            }
        }

        private void levelOrderTraversalRecursive(queue<BTNode> queue) {
            // implemnt this
        }


        public Integer maxTree(BTNode treeNode)
        {
            if (treeNode == null)
                return Integer.MIN_VALUE;

            int result = treeNode.getData();
            int leftResult = maxTree(treeNode.getLeft());
            int rightResult = maxTree(treeNode.getRight());

            if(leftResult > result)
                result = leftResult;
            if(rightResult > result)
                result = rightResult;

            return result;

        }

}
