package class10.dsa.queue.data;

public class queueNode {

    private final String carName;
    private queueNode next;

    public queueNode(String carName) {
    this.carName = carName;
    }

    public void setNext(queueNode next) {
        this.next = next;
    }

    public String getCarName() {
        return carName;
    }

    public queueNode getNext() {
        return next;
    }

    @Override
    public String toString() {
        String result = "";
        result += carName;
        return result;
    }
}

