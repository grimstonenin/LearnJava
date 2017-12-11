package TDDUdemy.PolishCalculator.main;

import java.math.BigDecimal;

public abstract class BinaryOperations implements Operation {

    @Override
    public void apply(OperandStack stack) {
        BigDecimal value1 = stack.peek();
        stack.pop();
        BigDecimal value2 = stack.peek();
        stack.replace(calculate(value1, value2));
    }

    public abstract BigDecimal calculate(BigDecimal value1, BigDecimal value2);

}
