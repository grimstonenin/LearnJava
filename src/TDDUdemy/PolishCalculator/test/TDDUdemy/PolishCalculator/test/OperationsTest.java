package TDDUdemy.PolishCalculator.test;

import TDDUdemy.PolishCalculator.main.Calculator;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class OperationsTest {

    private Calculator calculator;

    @Before
    public void init(){
        calculator = new Calculator();
        calculator.setAccumulator(new BigDecimal(20));
        calculator.enter();
        calculator.setAccumulator(new BigDecimal(4));
    }


    @Test
    public void testAddExecution(){
        calculator.execute("+");
        assertEquals(new BigDecimal(24),calculator.getAccumulator());
    }

    @Test
    public void testSubstractExecution(){
        calculator.execute("-");
        assertEquals(new BigDecimal(16),calculator.getAccumulator());
    }

    @Test
    public void testMultiplyOperation(){
        calculator.execute("*");
        assertEquals(new BigDecimal(80),calculator.getAccumulator());
    }

    @Test
    public void testDivisionOperation(){
        calculator.execute("/");
        assertEquals(new BigDecimal(0),calculator.getAccumulator());
    }

    @Test
    public void testSquareOperation(){
        Calculator calculator = new Calculator();
        BigDecimal value = new BigDecimal(4);
        calculator.setAccumulator(value);
        calculator.enter();

        calculator.execute("sq");
        assertEquals(new BigDecimal(16),calculator.getAccumulator());
    }
}
