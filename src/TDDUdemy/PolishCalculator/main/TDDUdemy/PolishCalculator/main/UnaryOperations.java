package TDDUdemy.PolishCalculator.main;

import java.math.BigDecimal;

public abstract class UnaryOperations implements Operation {

    @Override
    public void apply(OperandStack stack) {
        BigDecimal value = stack.peek();
        stack.pop();
        stack.replace(calculate(value));
    }

    abstract BigDecimal calculate(BigDecimal value);
}
