/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package class10.dsa;

import class10.dsa.queue.data.queueNode;
import class10.dsa.queue.structure.queue;
import class10.dsa.queue.structure.pseudoQueue;
import class10.dsa.stack.data.stackNode;
import class10.dsa.stack.structure.stack;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        stack stackExample = new stack();
        if (stackExample.isEmpty()){
            System.out.println("The stack is Empty");
        }

        stackExample.push(new stackNode("Audi"));
        stackExample.push(new stackNode("Mercedes"));
        stackExample.push(new stackNode("RangeRover"));

//        System.out.println(stackExample);
//        System.out.println(stackExample.peek());
//        System.out.println(stackExample.pop());

        queue queueExample = new queue();

        if(queueExample.isEmpty())
        {
            System.out.println("The Queue is Empty");
        }

        queueExample.enqueue("Jaguar");
        queueExample.enqueue("Purchase");
        queueExample.enqueue("Lexus");

//        System.out.println(queueExample);
//        System.out.println(queueExample.peek());
//        System.out.println(queueExample.dequeue());
//        System.out.println(queueExample.peek());


        stack stack1 = new stack();
        stack stack2 = new stack();


        String[] keys = {"20","15","10"};
        pseudoQueue pQueue = new pseudoQueue(stack1,stack2);

        // insert above keys
        for (String key: keys) {
            pQueue.enqueue(key);
        }

        System.out.println("List : " + pQueue); // {10}{15}{20}
        pQueue.enqueue("5");

        System.out.println("List : " + pQueue);// {5}{10}{15}{20}

//        System.out.println("List : " + pQueue);

        System.out.println(pQueue.dequeue());    // print   ->  20
        System.out.println(pQueue.dequeue());    // print   ->  15

        System.out.println("List : " + pQueue);

    }

}
