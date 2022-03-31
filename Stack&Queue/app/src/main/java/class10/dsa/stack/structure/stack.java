package class10.dsa.stack.structure;

import class10.dsa.queue.data.queueNode;
import class10.dsa.stack.data.stackNode;

import java.util.EmptyStackException;

public class stack {

    private stackNode top;


    public stack() {
        top = null;
    }
    // push    pop   peek  isEmpty

    public boolean isEmpty()
    {
        return top == null;
    }

    public stackNode push(String value){
        stackNode stackNode = new stackNode(value);
        if(isEmpty())
        {
            top = stackNode;
            return stackNode;
        }
        else{
            stackNode.setNext(top);
            top = stackNode;
            return stackNode;
        }

    }


    public stackNode peek()
    {
        return top;
    }


    public stackNode pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            stackNode temp;
            temp = top;
            top = temp.getNext();
            temp.setNext(null);
            return temp;
        }
    }

    @Override
    public String toString() {
        stackNode pointer = this.top;
        String result = "";
        while (pointer != null) {
            result += pointer.getCar() ;
            pointer = pointer.getNext();
        }
        return result;
    }
}

