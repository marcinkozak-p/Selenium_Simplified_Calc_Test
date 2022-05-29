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

    public static Operator getOperation(String operation) {
        for (Operator e : values()) {
            if (e.getAction().equals(operation)) {
                return e;
            }
        }
        throw new IllegalArgumentException("Described operation is not supported");
    }
}