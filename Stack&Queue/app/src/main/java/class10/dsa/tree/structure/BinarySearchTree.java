package class10.dsa.tree.structure;


import class10.dsa.tree.data.BTNode;
import class10.dsa.tree.data.BinaryNode;
import class10.dsa.tree.data.Node;

public class BinarySearchTree<T extends Comparable<Integer>> {

        public enum TraversalOrder {
            INORDER,
            PREORDER,
            POSTORDER
        }

        private Node<Integer> root;
        private int size;

        public void add(int data) {
            if (isTreeEmpty()) {
                root = new BinaryNode<>(data);
                size++;
            } else {
                add(data, root);
            }
        }

        private Node add(Integer data, Node<Integer> root) {

            Node newNode = new BinaryNode(data);
            Node x = root;

            Node y = null;

            while (x != null) {
                y = x;
                if (data.compareTo((Integer) x.getData()) < 0 )
                    x = x.getLeftNode();
                else
                    x = x.getRightNode();
            }

            if (y == null)
                y = newNode;

            else if (data.compareTo((Integer) y.getData()) < 0)
                y.setLeftNode(newNode);

            else
                y.setRightNode(newNode);

            return y;
        }

        public void traverse(TraversalOrder order) {
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
            }
        }

        private void inOrder(Node<Integer> treeNode) {
            if (treeNode == null) { // base case
                return;
            }

            inOrder(treeNode.getLeftNode()); // left

            printNode(treeNode); // root

            inOrder(treeNode.getRightNode()); // right
        }

        private void preOrder(Node<Integer> treeNode) {
            if (treeNode == null) {
                return;
            }

            printNode(treeNode);

            preOrder(treeNode.getLeftNode());

            preOrder(treeNode.getRightNode());
        }

        private void postOrder(Node<Integer> treeNode) {
            if (treeNode == null) {
                return;
            }

            postOrder(treeNode.getLeftNode());

            postOrder(treeNode.getRightNode());

            printNode(treeNode);
        }

        private void printNode(Node<Integer> node) {
            // implement this
            System.out.println(node.getData());
        }

        public int size() {
            return size;
        }

        public boolean isTreeEmpty() {
            return root == null;
        }

        public boolean contains(Integer searchTerm) {
            if (isTreeEmpty()) {
                return false;
            } else {
                return containsHelper(searchTerm, root);
            }
        }

        private boolean containsHelper(Integer searchTerm, Node<Integer> root) throws NullPointerException  {
            // implement this
            if (root == null)
            {
                return false;
            }
            if(searchTerm == root.getData())
            {
                return true;
            }
            else if(searchTerm > root.getData())
            {
                return containsHelper(searchTerm, root.getRightNode());
            }
            else if(searchTerm < root.getData())
            {
                return containsHelper(searchTerm, root.getLeftNode());
            }
            else return false;
        }


    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                ", size=" + size +
                '}';
    }
}
