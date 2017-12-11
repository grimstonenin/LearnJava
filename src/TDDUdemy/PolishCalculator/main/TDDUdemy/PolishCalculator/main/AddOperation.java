package TDDUdemy.PolishCalculator.main;

import java.math.BigDecimal;

public class AddOperation extends BinaryOperations {


    @Override
    public BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
       return value1.add(value2);
    }
}
