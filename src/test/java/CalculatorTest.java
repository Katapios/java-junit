import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS) //no need to do static methods
public class CalculatorTest {
    Calculator calc = null;

    /*
    ICalculator iCalculator = new ICalculator() {
        @Override
        public int add(int a, int b) {
            return a + b;
        }
    };
    */

    ICalculator iCalculator = mock(ICalculator.class);

    @BeforeAll
    public void setUp() {
        calc = new Calculator(iCalculator);
    }

    @Test
    public void testMult() {
        //mock
        when(iCalculator.add(2, 3)).thenReturn(5);
        assertEquals(10, calc.mult(2, 3));
        //is function refers to interface
        verify(iCalculator).add(2, 3);
    }
}
