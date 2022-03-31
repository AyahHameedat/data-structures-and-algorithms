package class10.dsa.tree.data;

public abstract class Node<Integer extends Comparable<Integer>> implements Comparable<Node<Integer>> {
        private final Integer data;
        private Node<Integer> leftNode;
        private Node<Integer> rightNode;

        public Node(Integer data) {
            this.data = data;
        }

        public Integer getData() {
            return data;
        }

        public Node<Integer> getLeftNode() {
            return leftNode;
        }

        public Node<Integer> getRightNode() {
            return rightNode;
        }

        public void setLeftNode(Node<Integer> leftNode) {
            this.leftNode = leftNode;
        }

        public void setRightNode(Node<Integer> rightNode) {
            this.rightNode = rightNode;
        }
    }
