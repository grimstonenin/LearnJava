package TDDUdemy.PolishCalculator.main;

import java.math.BigDecimal;

public class DivisionOperation extends BinaryOperations {
    @Override
    public BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
        return value1.divide(value2,BigDecimal.ROUND_HALF_UP);
    }
}
