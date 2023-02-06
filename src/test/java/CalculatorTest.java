import org.example.Calculator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc;
    @Before
    public void setUp () {
        calc = new Calculator();
    }
    @Test
    public void calculatorHasAdd () {
        assertEquals(5, calc.add(3,2));
    }
    @Test
    public void calculatorHasSubtract () {
        assertEquals(5, calc.subtract(8, 3));
    }
    @Test
    public void calculatorHasMultiply () {
        assertEquals(10, calc.multiply(2, 5));
    }
    @Test
    public void calculatorHasDivide () {
        assertEquals(2.5, calc.divide(5, 2), 0.00);
    }
}
