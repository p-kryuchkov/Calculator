import java.util.Objects;

public class Calculator {
    private static double firstNumber;
    private static double secondNumber;
    private static String operation;
    private static double result;

    public Calculator(double firstNumber, double secondNumber, String operation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
    }

    public static double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public static double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public static String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public static double getResult() {
            if (Objects.equals(operation, "+")) {
                result = firstNumber + secondNumber;
            } else if (Objects.equals(operation, "-")) {
                result = firstNumber - secondNumber;
            } else if (Objects.equals(operation, "*")) {
                result = firstNumber * secondNumber;
            } else if (Objects.equals(operation, "/")) {
                if (secondNumber == 0) throw new ArithmeticException();
                else result = firstNumber / secondNumber;
            }



        return result;

    }

}




