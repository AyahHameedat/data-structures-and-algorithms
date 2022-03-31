/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package class10;

import class10.dsa.App;
import class10.dsa.queue.data.queueNode;
import class10.dsa.queue.structure.*;
import class10.dsa.stack.data.stackNode;
import class10.dsa.stack.structure.MultiBracket;
import class10.dsa.stack.structure.stack;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
        @Test
        @DisplayName("Test1")
        void pushStack()
        {
            stack stackTest = new stack();
            String result = String.valueOf(stackTest.push("Audi"));
            stackNode reStack = new stackNode("Audi");
            String expected = String.valueOf(reStack);
            assertEquals(expected , result);
        }

//    @Test
//    @DisplayName("Test2")
//    void pushMulValStack()
//    {
//        stack stackTest = new stack();
//        stackTest.push("Audi");
//        stackTest.push("Mercedes");
//        stackTest.push("RangeRover");
//        String result = String.valueOf(stackTest);
//        String expected = "{RangeRover}{Mercedes}{Audi}";
//        assertEquals(expected , result);
//    }
//
//    @Test
//    @DisplayName("Test3")
//    void popOneOfStack()
//    {
//        stack stackTest = new stack();
//        stackTest.push("Audi");
//        stackTest.push("Mercedes");
//        stackTest.push("RangeRover");
//        stackTest.pop();
//        System.out.println(stackTest.peek());
//        String result = String.valueOf(stackTest);
//        String expected = "{Mercedes}{Audi}";
//        assertEquals(expected , result);
//    }

    @DisplayName("Test4")
    void popEmptyStack()
    {
        stack stackTest = new stack();
        stackTest.push("Audi");
        stackTest.push("Mercedes");
        stackTest.push("RangeRover");

        stackTest.pop();
        stackTest.pop();
        stackTest.pop();

        System.out.println(stackTest);

        String result = String.valueOf(stackTest);
        String expected = "";
        assertEquals(expected , result);
    }

    @Test
    @DisplayName("Test5")
    void peekStack()
    {
        stack stackTest = new stack();
        stackTest.push("Audi");
        stackTest.push("Mercedes");
        stackTest.push("RangeRover");
        System.out.println(stackTest.peek());
        String result = String.valueOf(stackTest.peek().getCar());
        String expected = "RangeRover";
        assertEquals(expected , result);
    }
    // How to test Exception in Junit
//  Resourse ->  https://www.baeldung.com/junit-assert-exception
//    @Test
//    @DisplayName("Test6")
//    void popPeekExp()
//    {
//        stack stackTest = new stack();
//        Exception exp = assertThrows(Exception.class, () -> {stackTest.pop();});
//        System.out.println(exp);
//        String result = "null";
//        String expected = exp.getMessage();
//        assertEquals(expected,result);
//    }

    @Test
    @DisplayName("Test7")
    void emptyStack()
    {
        stack stackTest = new stack();
        String result = "";
        String expected = String.valueOf(stackTest);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test8")
    public void pushQueue(){
//        Jaguar");"Purchase");"Lexus")
        queue queueTest = new queue();
        String result = String.valueOf(queueTest.enqueue("Jaguar"));
        queueNode nodeTest = new queueNode("Jaguar");
        String expected = String.valueOf(nodeTest);
        assertEquals(expected , result);
    }

    @Test
    @DisplayName("Test9")
    public void pushMulQueue(){
//        Jaguar");"Purchase");"Lexus")
        queue queueTest = new queue();
        queueTest.enqueue("Jaguar");
        queueTest.enqueue("Purchase");
        queueTest.enqueue("Lexus");

        String result = String.valueOf(queueTest);
        String expected = "{Jaguar}{Purchase}{Lexus}";
        assertEquals(expected , result);
    }

    @Test
    @DisplayName("Test10")
    public void dequeueOneQueue(){
//        Jaguar");"Purchase");"Lexus")
        queue queueTest = new queue();
        queueTest.enqueue("Jaguar");
        queueTest.enqueue("Purchase");
        queueTest.enqueue("Lexus");

        queueTest.dequeue();

        String result = String.valueOf(queueTest);
        String expected = "{Purchase}{Lexus}";
        assertEquals(expected , result);
    }

    @Test
    @DisplayName("Test11")
    public void peekQueue(){
//        Jaguar");"Purchase");"Lexus")
        queue queueTest = new queue();
        queueTest.enqueue("Jaguar");
        queueTest.enqueue("Purchase");
        queueTest.enqueue("Lexus");

        String result = String.valueOf(queueTest.peek().getCarName());
        String expected = "Jaguar";
        assertEquals(expected , result);
    }

    @Test
    @DisplayName("Test12")
    public void dequeueEmptyQueue(){
//        Jaguar");"Purchase");"Lexus")
        queue queueTest = new queue();
        queueTest.enqueue("Jaguar");
        queueTest.enqueue("Purchase");
        queueTest.enqueue("Lexus");

        queueTest.dequeue();
        queueTest.dequeue();
        queueTest.dequeue();

        String result = String.valueOf(queueTest);
        String expected = "";
        assertEquals(expected , result);
    }

    @Test
    @DisplayName("Test13")
    void emptyQueue()
    {
        queue queueTest = new queue();
        String result = String.valueOf(queueTest.toString());
        String expected ="";
        assertEquals(expected,result);
    }

//    @Test
//    @DisplayName("Test14")
//    void expPeekDeqQueue()
//    {
//        queue queueTest = new queue();
//        Exception expDeq = assertThrows(Exception.class, ()->{queueTest.dequeue();});
////        Exception expPeek = assertThrows(Exception.class, ()->{queueTest.peek();});
//        String result1 = expDeq.getMessage();
////        String result2 = expPeek.getMessage();
//        String expected ="The QUEUE is Empty";
//        assertEquals(expected,result1);
//    }



//    pseudoQueue

//    @Test
//    @DisplayName("pseudoEnqueue")
//    void pseudoQueueEnqNull()
//    {
//        stack stack1 = new stack();
//        stack stack2 = new stack();
//
//        String[] keys = {"20","15","10"};
//        pseudoQueue pQueue = new pseudoQueue(stack1,stack2);
//
//        for (String key: keys) {
//            pQueue.enqueue(key);
//        }
//
//        pQueue.enqueue("5");
//
//        String result = pQueue.toString();
//        String expected = "{5}{10}{15}{20}";
//        assertEquals(expected, result);
//
//    }
//
//    @Test
//    @DisplayName("pseudoDequeue")
//    void pseudoQueueDequeue()
//    {
//        stack stack1 = new stack();
//        stack stack2 = new stack();
//
//        String[] keys = {"20","15","10"};
//        pseudoQueue pQueue = new pseudoQueue(stack1,stack2);
//
//        for (String key: keys) {
//            pQueue.enqueue(key);
//        }
//        pQueue.enqueue("5");
//
//        //Dequeue
//        pQueue.dequeue();
//        pQueue.dequeue();
//        String result = pQueue.toString();
//        String expected = "{10}{5}";
//        assertEquals(expected, result);
//
//    }



    @Test
    @DisplayName("Brackets")
    void validBrackets()
    {
        stack stack = new stack();
        String s = "{[()]}";
        MultiBracket multiBracket = new MultiBracket(stack);
        boolean result = true;
        boolean expected = multiBracket.validateBrackets(s);
        assertEquals(expected, result);
    }


    @Test
    @DisplayName("Animal Shelter Test1")
    void animalShelterEnqueue(){
        queue<cat> qCat = new queue();
        queue<dog> qDog = new queue();
        AnimalShelter qNew = new AnimalShelter("cat", qCat, qDog);
        qNew.enqueue("cat");
        qNew.enqueue("cat");
        qNew.enqueue("dog");
        qNew.enqueue("cat");
        qNew.enqueue("dog");

        String result ="AnimalShelter => {cat}{cat}{cat}{dog}{dog}";
        String expected = qNew.toString();

        assertEquals(expected, result);
//        AnimalShelter => {cat}{cat}{dog}{dog}
    }

    @Test
    @DisplayName("Animal Shelter Test2")
    void animalShelterDequeue(){
        queue<cat> qCat = new queue();
        queue<dog> qDog = new queue();
        AnimalShelter qNew = new AnimalShelter("cat", qCat, qDog);
        qNew.enqueue("cat");
        qNew.enqueue("cat");
        qNew.enqueue("dog");
        qNew.enqueue("cat");
        qNew.enqueue("dog");

        qNew.dequeue("cat");

        String result ="AnimalShelter => {cat}{cat}{dog}{dog}";
        String expected = qNew.toString();

        assertEquals(expected, result);
    }
}
