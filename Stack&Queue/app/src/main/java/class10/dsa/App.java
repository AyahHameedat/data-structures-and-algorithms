/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package class10.dsa;

import class10.dsa.queue.data.queueNode;
import class10.dsa.queue.structure.*;
import class10.dsa.stack.data.stackNode;
import class10.dsa.stack.structure.MultiBracket;
import class10.dsa.stack.structure.stack;
import class10.dsa.tree.data.BTNode;
import class10.dsa.tree.data.BinaryNode;
import class10.dsa.tree.structure.BinarySearchTree;
import class10.dsa.tree.structure.BinaryTree;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
//        System.out.println(new App().getGreeting());
//
//        stack stackExample = new stack();
//        if (stackExample.isEmpty()){
//            System.out.println("The stack is Empty");
//        }
//
//        stackExample.push(new stackNode("Audi"));
//        stackExample.push(new stackNode("Mercedes"));
//        stackExample.push(new stackNode("RangeRover"));
//
////        System.out.println(stackExample);
////        System.out.println(stackExample.peek());
////        System.out.println(stackExample.pop());
//
//        queue queueExample = new queue();
//
//        if(queueExample.isEmpty())
//        {
//            System.out.println("The Queue is Empty");
//        }
//
//        queueExample.enqueue("Jaguar");
//        queueExample.enqueue("Purchase");
//        queueExample.enqueue("Lexus");
//
////        System.out.println(queueExample);
////        System.out.println(queueExample.peek());
////        System.out.println(queueExample.dequeue());
////        System.out.println(queueExample.peek());
//
//
//        stack stack1 = new stack();
//        stack stack2 = new stack();
//
//
//        String[] keys = {"20","15","10"};
//        pseudoQueue pQueue = new pseudoQueue(stack1,stack2);
//
//        // insert above keys
//        for (String key: keys) {
//            pQueue.enqueue(key);
//        }
//
//        System.out.println("List : " + pQueue); // {10}{15}{20}
//        pQueue.enqueue("5");
//
//        System.out.println("List : " + pQueue);// {5}{10}{15}{20}
//
////        System.out.println("List : " + pQueue);
//
//        System.out.println(pQueue.dequeue());    // print   ->  20
//        System.out.println(pQueue.dequeue());    // print   ->  15
//
//        System.out.println("List : " + pQueue);
//


//
//        queue<cat> q = new queue();
//        queue<dog> q2 = new queue();
//        AnimalShelter qNew = new AnimalShelter("cat", q, q2);
//        qNew.enqueue("cat");
//        qNew.enqueue("cat");
//        qNew.enqueue("dog");
//        qNew.enqueue("cat");
//        qNew.enqueue("dog");
//        System.out.println(qNew);
//
//        qNew.dequeue("cat");
////        qNew.dequeue("cat");
////        qNew.dequeue("dog");
//        System.out.println(qNew.toString());
//
//
//        stack stack = new stack();
//        String s = "{[()]}";
//        MultiBracket multiBracket = new MultiBracket(stack);
//        System.out.println("Result : " + multiBracket.validateBrackets(s));

//
        System.out.println("AYA HAMEEDAT ^_^");
//
//        System.out.println("-------------------BT------------------------");
//
//
        BinaryTree<Integer> BinTree = new BinaryTree<>();
        BinTree.setRoot(new BTNode(15));

        BinTree.getRoot().setLeft(new BTNode(8));
        BinTree.getRoot().setRight(new BTNode(20));

        BinTree.getRoot().getRight().setRight(new BTNode(35));
        BinTree.getRoot().getRight().setLeft(new BTNode(22));


        System.out.println(BinTree.fizzBuzzTree());

//
//        System.out.println("Post-Order");
//        BinTree.traverse(BinaryTree.TraversalOrder.POSTORDER);
//        System.out.println("In-Order");
//        BinTree.traverse(BinaryTree.TraversalOrder.INORDER);
//        System.out.println("Pre-Order");
//        BinTree.traverse(BinaryTree.TraversalOrder.PREORDER);
//
//        System.out.println("++++++++++++++++MAX+++++++++++");
//        System.out.println(BinTree.maxTree(BinTree.getRoot()));
//
//
//        System.out.println("*********************TRAVERSAL************************");
//        System.out.println(BinTree.levelOrderTraversalLoop());
//        System.out.println(" ");
//        System.out.println("-------------------BST-----------------------");
//
//        BinarySearchTree<Integer> BST = new BinarySearchTree<>();
//        BST.add(200);
//        BST.add(250);
//        BST.add(50);
//        BST.add(20);
//        BST.add(10);
//        BST.add(80);
//
//        BST.contains(10);
//        BST.contains(100);
//
//        System.out.println("-------Post-Order------");
//        BST.traverse(BinarySearchTree.TraversalOrder.POSTORDER);
//
//        System.out.println("------In-Order------");
//        BST.traverse(BinarySearchTree.TraversalOrder.INORDER);
//
//        System.out.println("------Pre-Order------");
//        BST.traverse(BinarySearchTree.TraversalOrder.PREORDER);

    }
}
