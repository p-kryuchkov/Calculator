public class Base {
    public static void main(String[] args) {
        Calculator firstNumber = new Calculator();
        Calculator secondNumber = new Calculator();
        Calculator operation = new Calculator();
        firstNumber.setFirstNumber(5);
        secondNumber.setSecondNumber(2);
        operation.setOperation("/");
        StringBuilder showResult = new StringBuilder();
        showResult.append(Calculator.getFirstNumber() + " " + Calculator.getOperation() + " " + Calculator.getSecondNumber() + " = " + Calculator.getResult());
        System.out.println(showResult.toString());

    }
}
