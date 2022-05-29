package taf;

public enum Operator {
    PLUS("plus"),
    TIMES("times"),
    MINUS("minus"),
    DIVIDE("divide");

    private final String operator;

    Operator(String operand) {
        this.operator = operand;
    }

    public String getAction() {
        return operator;
    }

}
