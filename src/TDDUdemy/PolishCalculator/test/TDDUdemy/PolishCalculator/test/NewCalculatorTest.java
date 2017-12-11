package TDDUdemy.PolishCalculator.test;

import TDDUdemy.PolishCalculator.main.Calculator;
import org.junit.Before;
import org.junit.Test;



import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;


public class NewCalculatorTest {

    private  Calculator calculator;

    @Before
    public void init(){

        calculator = new Calculator();

    }

    @Test
    public void testNewCalculatorHasAccumulatorZero(){

        assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
    }

    @Test
    public void testSettingsAccumulatorValue(){

        BigDecimal bigDecimal = new BigDecimal(23);
        calculator.setAccumulator(bigDecimal);

        assertEquals(bigDecimal,calculator.getAccumulator());
    }



}
