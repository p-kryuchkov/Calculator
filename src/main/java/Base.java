import java.util.Scanner;

public class Base {
    public static void main(String[] args) throws Exception {
        Scanner firstNumberIn = new Scanner(System.in);
        System.out.println("Введите первое число:");
        Calculator firstNumber = new Calculator();
        firstNumber.setFirstNumber(firstNumberIn.nextInt());
        Scanner secondNumberIn = new Scanner(System.in);
        System.out.println("Введите второе число:");
        Calculator secondNumber = new Calculator();
        secondNumber.setSecondNumber(secondNumberIn.nextInt());
        Scanner operationIn = new Scanner(System.in);
        System.out.println("Введите знак знак арифметического действия:");
        Calculator operation = new Calculator();
        operation.setOperation(operationIn.nextLine());
        firstNumberIn.close();
        secondNumberIn.close();
        operationIn.close();
        StringBuilder showResult = new StringBuilder();
        showResult.append(Calculator.getFirstNumber() + " " + Calculator.getOperation() + " " + Calculator.getSecondNumber() + " = "  + Calculator.getResult());
        System.out.println(showResult.toString());

    }
}
