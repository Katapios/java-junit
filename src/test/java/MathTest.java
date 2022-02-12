import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MathTest {
    static Math math = null;

    @BeforeAll
    public static void setUp() {
        math = new Math();
    }

    @AfterAll
    public static void tearDown() {
        math = null;
    }

    @Test
    //@Disabled
    @DisplayName("new name")
    //@RepeatedTest(3)
    //@Tag("number")
    public void testSumm() {

        assertAll(
                () -> assertEquals(math.sum(5, 7), 12, "doesn't work"),
                () -> assertNotEquals(12, 10)
        );

        //Math math = new Math();
        //assert res == 12 : "doesn't work";
    }

    @Nested
    @DisplayName("Extends")
    class SimpleMath {
        @Test
        public void testSetArray() {
            //Math math = new Math();
            int[] arr = math.setArray(4, 6, 8, 10, 0);
            int[] expected = {4, 6, 8, 10, 0};
            assertArrayEquals(arr, expected);
        }

        @Test
        public void testDivide() {
            //Math math = new Math();
            assertEquals(5, math.divide(10, 2), "doesn't work");
            assertThrows(ArithmeticException.class, () -> {
                math.divide(5, 0);
            });
        }
    }
}