package TDDUdemy.PolishCalculator.main;

import java.math.BigDecimal;

public class SquareOperation extends UnaryOperations {

    @Override
    BigDecimal calculate(BigDecimal value) {
        return value.pow(2);
    }


}
