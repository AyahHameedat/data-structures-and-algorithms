package class10.dsa.stack.data;

public class stackNode {

    private final String carName;
    private stackNode next;


    public stackNode(String carName) {
        this.carName = carName;
    }

    public stackNode() {

        carName = null;
    }

    public void setNext(stackNode next) {
        this.next = next;
    }

    public String getCar() {
        return carName;
    }

    public stackNode getNext() {
        return next;
    }


    @Override
    public String toString() {
        return "{"+ carName +
                '}';
    }
}
