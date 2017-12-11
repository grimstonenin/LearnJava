package TDDUdemy.PolishCalculator.main;

import java.math.BigDecimal;

public class Calculator {

    private OperandStack accumulator = new OperandStack();


    public void enter() {

        accumulator.push(getAccumulator());
    }

    public void drop() {
        accumulator.pop();
    }

    public BigDecimal getAccumulator() {
        return this.accumulator.peek();
    }

    public void setAccumulator(BigDecimal value) {
        this.accumulator.replace(value);
    }


    public void execute(String s) {
        Operation operation = null;
        if (s.equals("+")) operation = new AddOperation();
        if (s.equals("-")) operation = new SubstractOperation();
        if (s.equals("*")) operation = new MultiplyOperation();
        if (s.equals("/")) operation = new DivisionOperation();
        if (s.equals("sq")) operation = new SquareOperation();

        operation.apply(accumulator);
    }
}
