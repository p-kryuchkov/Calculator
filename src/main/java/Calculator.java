import java.util.Objects;

public class Calculator {
    private static int firstNumber;
    private static int secondNumber;
    private static String operation;
    private static int result;

    public Calculator() {
        this.firstNumber = Calculator.firstNumber;
        this.secondNumber = Calculator.secondNumber;
        this.operation = Calculator.operation;
    }

    public static int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public static int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public static String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public static int getResult() {
            if (Objects.equals(operation, "+")) {
                result = firstNumber + secondNumber;
            } else if (Objects.equals(operation, "-")) {
                result = firstNumber - secondNumber;
            } else if (Objects.equals(operation, "*")) {
                result = firstNumber * secondNumber;
            } else if (Objects.equals(operation, "/")) {
                result = firstNumber / secondNumber;
            }



        return result;

    }

}




