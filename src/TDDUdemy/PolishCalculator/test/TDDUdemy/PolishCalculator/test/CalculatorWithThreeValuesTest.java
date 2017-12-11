package TDDUdemy.PolishCalculator.test;

import TDDUdemy.PolishCalculator.main.Calculator;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CalculatorWithThreeValuesTest {

    private Calculator calculator;
    private BigDecimal value1;
    private BigDecimal value2;
    private BigDecimal value3;


    @Before
    public void init(){
        calculator = new Calculator();

        value1 = new BigDecimal(12);
        value2 = new BigDecimal(22);
        value3 = new BigDecimal(52);

        calculator.setAccumulator(value1);
        calculator.enter();
        calculator.setAccumulator(value2);
        calculator.enter();
        calculator.setAccumulator(value3);

    }

    @Test
    public void testCalculatorAfterAddingThreeValues(){
        assertEquals(value3,calculator.getAccumulator());
    }

    @Test
    public void testCalculatorAfterDroppingOneValue(){
        calculator.drop();
        assertEquals(value2, calculator.getAccumulator());
    }

    @Test
    public void testCalculatorAfterDroppingTwoValues(){
        calculator.drop();
        calculator.drop();
        assertEquals(value1, calculator.getAccumulator());


    }
}
