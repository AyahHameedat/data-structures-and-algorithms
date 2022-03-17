package class10.dsa.queue.structure;

import class10.dsa.queue.data.queueNode;
import class10.dsa.stack.data.stackNode;

import java.util.NoSuchElementException;

public class queue {

//    private static final int QUEUE_SIZE = 5;
//    private int size;

    private queueNode rear;
    private queueNode front;


    public queue() {
    }

    // enqueue  // dequeue // peek // is empty

    public boolean isEmpty()
    {
        return front == null;
    }

    public queueNode enqueue(String value){
        queueNode temp = new queueNode(value);
        if (isEmpty())
        {
            front = temp;
            rear = temp;
        }
        else{
            rear.setNext(temp);
            rear = temp;
        }
        return temp;
    }

    public queueNode dequeue()
    {
        queueNode temp;
        if (isEmpty())
        {
            throw new NoSuchElementException("The QUEUE is Empty");
        } else {
            temp = front;
            front = front.getNext();
        }
        return temp;
    }

    public queueNode peek()
    {
        if(isEmpty())
        {
            return null;
        }
        else{
            return front; }
    }

    @Override
    public String toString() {
        queueNode pointer = this.front;
        String result = "";
        while (pointer != null) {
           result += "{" + pointer.getCarName() + "}";
           pointer = pointer.getNext();
        }
        return result;
    }
}
