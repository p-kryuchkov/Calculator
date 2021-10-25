import java.util.InputMismatchException;
import java.util.Scanner;

public class Base {
    public static void main(String[] args) throws Exception {
        try {
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
            String validationResult = operationIn.findInLine("[+-/*]");
            if (validationResult != null) {
                Calculator operation = new Calculator();
                operation.setOperation(validationResult);
            }
            else throw new IllegalArgumentException();
            firstNumberIn.close();
            secondNumberIn.close();
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
