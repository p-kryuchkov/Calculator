public class Base {
    public static void main(String[] args) {
        Calculator firstNumber = new Calculator();
        Calculator secondNumber = new Calculator();
        Calculator operation = new Calculator();
        firstNumber.setFirstNumber(25);
        secondNumber.setSecondNumber(2);
        operation.setOperation("*");
        System.out.println(Calculator.toString());


    }
}
