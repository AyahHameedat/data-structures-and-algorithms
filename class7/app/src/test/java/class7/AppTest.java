/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package class7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    @DisplayName("Insert Method")
    void insertMethod()
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert(5);
        list.insert(10);
        list.insert(12);
        list.insert(99);

        String exp = list.toString();
        String res = "{99}->{12}->{10}->{5}->X";

        assertEquals(exp, res);
    }


    @Test
    @DisplayName("kthFromEnd Method")
    void kthFromEnd()
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert(5);
        list.insert(10);
        list.insert(12);
        list.insert(99);

        String exp = String.valueOf(list.kthFromEnd(1));
        String res = "5";

        assertEquals(exp, res);
    }

}
