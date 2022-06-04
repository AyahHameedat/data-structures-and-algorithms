/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test
    @DisplayName("Empty Array MergeSort")
    public void emptyMergeSortArray() {
        int[] arr = new int[]{};
        App.mergeSort(arr);
        int[] expected = {};

        assertEquals(Arrays.toString(expected), Arrays.toString(arr));
    }


    @Test
    @DisplayName("Merge Sort")
    public void mergeSort() {
        int[] arr = new int[]{12, 11, 13, 5, 6, 7};
        App.mergeSort(arr);
        int[] expected = {5, 6, 7, 11, 12, 13};

        assertEquals(Arrays.toString(expected), Arrays.toString(arr));

    }
}