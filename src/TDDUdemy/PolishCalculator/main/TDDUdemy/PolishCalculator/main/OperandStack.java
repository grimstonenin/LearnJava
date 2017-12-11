package TDDUdemy.PolishCalculator.main;

import java.math.BigDecimal;
import java.util.Stack;

public class OperandStack {

    private Stack<BigDecimal> values = new Stack<>();

    public BigDecimal peek() {
        if(values.empty()) return BigDecimal.ZERO;
        return values.peek();
    }

    public void push(BigDecimal value) {
        values.push(value);
    }

    public void replace(BigDecimal value) {
        pop();
        values.push(value);
    }

    public void pop() {
        if(!values.empty()) values.pop();
    }
}
