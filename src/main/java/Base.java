import java.util.InputMismatchException;
import java.util.Scanner;

public class Base {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число:");
            double firstNumber = scanner.nextDouble();
            System.out.println("Введите второе число:");
            double secondNumber = scanner.nextDouble();
            Scanner operationIn = new Scanner(System.in);
            System.out.println("Введите знак знак арифметического действия:");
            String validationResult = operationIn.findInLine("[+-/*]");
            String operation;
            if (validationResult != null) {
                operation = validationResult;
            }
            else throw new IllegalArgumentException();
            Calculator calculator = new Calculator(firstNumber, secondNumber, operation);
            scanner.close();
            operationIn.close();
            StringBuilder showResult = new StringBuilder();
            showResult.append(Calculator.getFirstNumber() + " " + Calculator.getOperation() + " " + Calculator.getSecondNumber() + " = " + Calculator.getResult());
            System.out.println(showResult.toString());
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели неверное значение");
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        } catch (IllegalArgumentException e ){
            System.out.println("Нет такой операции");
        }


    }
}
