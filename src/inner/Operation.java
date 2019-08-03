package inner;

public class Operation {

    private float a;
    private float b;
    private String operation;
    private boolean isOperation; //флаг, указывающий, что была операция


    public String getOperation() {
        return operation;
    }

    public boolean getIsOperation() {
        return isOperation;
    }

    public void setIsOperation(boolean isOperation) {
        this.isOperation = isOperation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    private float addition() {
        return a + b;
    }

    private float subtraction() {
        return a - b;
    }

    private float multiplay() {
        return a * b;
    }

    private float division() {
        return a / b;
    }

    public float action() {
        float result = 0;
        switch (this.operation) {
            case "+":
                result = this.addition();
                break;
            case "-":
                result = this.subtraction();
                break;
            case "*":
                result = this.multiplay();
                break;
            case "/":
                result = this.division();
                break;
            default:
                result = 0;

        }
        return result;
    }

}
