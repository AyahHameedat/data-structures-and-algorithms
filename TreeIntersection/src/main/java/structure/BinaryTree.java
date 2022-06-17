package structure;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import data.BTNode;



public class BinaryTree<T extends Comparable<T>> {

    private BTNode root;
    List BTList = new ArrayList<>();

    public BinaryTree(BTNode btNode) {

    }

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


    public List fizzBuzzTree()
    {
        Queue<BTNode> queue = new LinkedList<BTNode>();

        queue.add(root);

        while (!queue.isEmpty()) {
            BTNode tempNode = queue.poll();

            if (tempNode.getLeft() != null || tempNode.getRight() != null) {
                queue.add(tempNode.getLeft());
                queue.add(tempNode.getRight());

                if ((tempNode.getData() % 3 == 0) && (tempNode.getData() % 5 == 0)) {
                    queue.add(tempNode.getLeft());
                    queue.add(tempNode.getRight());
                    BTList.add("FizzBuzz");
                }

                else if (tempNode.getData() % 3 == 0) {
                    queue.add(tempNode.getLeft());
                    queue.add(tempNode.getRight());
                    BTList.add("Fizz");
                }
                else if (tempNode.getData() % 5 == 0) {
                    queue.add(tempNode.getLeft());
                    queue.add(tempNode.getRight());
                    BTList.add("Buzz");
                }

            }

            else if ((tempNode.getData() % 5 != 0 )|| (tempNode.getData() % 5 != 0))
            {
                BTList.add(String.valueOf(tempNode.getData()));
            }
        }
        return BTList;
    }
}