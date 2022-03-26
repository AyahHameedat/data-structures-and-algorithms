package class10.dsa.queue.structure;

import class10.dsa.stack.data.stackNode;
import class10.dsa.stack.structure.stack;

public class pseudoQueue {
    private stack stack1, stack2;

    public pseudoQueue(stack stack1, stack stack2) {
        this.stack1 = stack1;
        this.stack2 = stack2;
    }

    public void enqueue(String value)
    {
        stack1.push(value);
    }

    public stackNode dequeue()
    {
        if (stack1.isEmpty() && stack2.isEmpty())
        {
            System.out.println("stack1 & stack2 is Empty");
        }

        else if (stack2.isEmpty())
        {
            while (!stack1.isEmpty()) {
                stack2.push(String.valueOf(stack1.pop()));
            }
        }

//        stack1.push(stack2.peek());

        return stack2.pop();
    }

    @Override
    public String toString() {
        return "" + stack1 + stack2;
    }


}
