package class10.dsa.tree.structure;


import class10.dsa.queue.structure.queue;
import class10.dsa.tree.data.BTNode;
import class10.dsa.tree.data.Node;

import java.util.ArrayList;
import java.util.List;


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

    public void traverse(BinaryTree.TraversalOrder order) {
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
    }


    private List inOrder(BTNode treeNode) {
        if (treeNode == null) { // base case
            return BTList;
        }

        inOrder(treeNode.getLeft()); // left

        printNode(treeNode); // root

        inOrder(treeNode.getRight()); // right

        BTList.add(treeNode.getData());

        return BTList;
    }

    private List preOrder(BTNode treeNode) {
        if (treeNode == null) {
            return BTList;
        }

        printNode(treeNode);

        preOrder(treeNode.getLeft());

        preOrder(treeNode.getRight());

        BTList.add(treeNode.getData());


        return BTList;
    }

    private List postOrder(BTNode treeNode) {
        if (treeNode == null) {
            return BTList;
        }

        postOrder(treeNode.getLeft());

        postOrder(treeNode.getRight());

        printNode(treeNode);
        BTList.add(treeNode.getData());


        return BTList;

    }

    private void printNode(BTNode node) {
        // implement this
        System.out.println(node.getData());
    }



    public void levelOrderTraversalLoop() {
            if (root != null) {
                queue<BTNode> queue = new queue<>();
                queue.enqueue(String.valueOf(root));

                BTNode node;
                while (!queue.isEmpty()) {
                    node = queue.dequeue();
                    System.out.print(node.getData() + " => ");
                    if (node.getLeft() != null) {
                        queue.enqueue(String.valueOf(node.getLeft()));
                    }

                    if (node.getRight() != null) {
                        queue.enqueue(String.valueOf(node.getRight()));
                    }
                }
            } else {
                System.out.println("Tree empty");
            }
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
}
