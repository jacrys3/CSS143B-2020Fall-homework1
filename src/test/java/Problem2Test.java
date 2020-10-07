import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        int inputs[][] = {
                {1, 2, 3, 4, 5},
                {4, 3, 5, 2, 1},
                {},
                {1},
                {1, 1, 1},
                {4, 4, 2, 1, 2},
                {5, 4, 3, 2, 1},
                {-1,3,-5},
                {-2},
                {-3,-2,-1,0}
        };
        int answers[][] = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {},
                {1},
                {1, 1, 1},
                {1, 2, 2, 4, 4},
                {1, 2, 3, 4, 5},
                {-5,-1,3},
                {-2},
                {-3,-2,-1,0}
        };
        assertEquals(inputs.length, answers.length);
        for (int i = 0; i < inputs.length; i++) {
            Problem2.bubbleSort(inputs[i]);
            try {
                assertEquals(inputs[i], answers[i]);
            } catch(AssertionError e) {
                System.out.println("");
                System.out.println("**Test case " + i + " failed: " + e);
            }
        }
    }
}
