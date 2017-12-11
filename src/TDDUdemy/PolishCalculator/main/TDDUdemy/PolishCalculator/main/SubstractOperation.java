package TDDUdemy.PolishCalculator.main;

import java.math.BigDecimal;

public class SubstractOperation extends BinaryOperations {

    @Override
    public BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
        return value2.subtract(value1);
    }
}
