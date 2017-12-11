package TDDUdemy.PolishCalculator.test;

import TDDUdemy.PolishCalculator.main.OperandStack;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class OperandStackTest {

    private OperandStack stack;

    @Before
    public void init(){
        stack = new OperandStack();
    }

    @Test
    public void testNewOperandStackReturnsZeroWhenEmpty(){


        assertEquals(BigDecimal.ZERO,stack.peek());
    }

    @Test
    public void testPushingValueOntoStack(){
        BigDecimal value = new BigDecimal(10);
        stack.push(value);
        assertEquals(value,stack.peek());
    }

    @Test
    public void testReplaceTopOperrandValue(){
        stack.push(new BigDecimal(22));
        BigDecimal value = new BigDecimal(33);
        stack.replace(value);
        assertEquals(value, stack.peek());
    }

    @Test
    public void testReplacingTopWithEmptyStack(){
        OperandStack stack = new OperandStack();
        BigDecimal value = new BigDecimal(20);
        stack.replace(value);
        assertEquals(value,stack.peek());
    }

    @Test
    public void testPoppingValueFromStack(){
        BigDecimal value = new BigDecimal(20);
        stack.push(value);
        stack.push(new BigDecimal(55));
        stack.pop();
        assertEquals(value,stack.peek());
    }

    @Test
    public void testPoppingValueFromEmptyStack(){
        stack.pop();
        assertEquals(BigDecimal.ZERO,stack.peek());
    }

}
