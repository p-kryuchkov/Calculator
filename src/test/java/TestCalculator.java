import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    @Test
    public void testCheckSum() {
        Calculator firstNumber = new Calculator();
        firstNumber.setFirstNumber(3);
        Calculator secondNumber = new Calculator();
        secondNumber.setSecondNumber(12);
        Calculator operation = new Calculator();
        operation.setOperation("+");
        assertEquals("Сложение считается неверно, верный ответ: 15", 15, Calculator.getResult(), 0);
    }
    @Test
    public void testCheckSub() {
        Calculator firstNumber = new Calculator();
        firstNumber.setFirstNumber(18);
        Calculator secondNumber = new Calculator();
        secondNumber.setSecondNumber(22);
        Calculator operation = new Calculator();
        operation.setOperation("-");
        assertEquals("Вычитание считается неверно, верный ответ: -4", -4, Calculator.getResult(), 0);
    }
    @Test
    public void testCheckMult() {
        Calculator firstNumber = new Calculator();
        firstNumber.setFirstNumber(16);
        Calculator secondNumber = new Calculator();
        secondNumber.setSecondNumber(27);
        Calculator operation = new Calculator();
        operation.setOperation("*");
        assertEquals("Умножение считается неверно, верный ответ: 432", 432, Calculator.getResult(), 0);
    }
    @Test
    public void testCheckDiv() {
        Calculator firstNumber = new Calculator();
        firstNumber.setFirstNumber(78);
        Calculator secondNumber = new Calculator();
        secondNumber.setSecondNumber(3);
        Calculator operation = new Calculator();
        operation.setOperation("/");
        assertEquals("Деление считается неверно, верный ответ: 26", 26, Calculator.getResult(), 0);
    }
    @Test
            (expected = ArithmeticException.class)
    public void testArithmeticException() {
        Calculator firstNumber = new Calculator();
        firstNumber.setFirstNumber(18);
        Calculator secondNumber = new Calculator();
        secondNumber.setSecondNumber(0);
        Calculator operation = new Calculator();
        operation.setOperation("/");
        assertEquals("Должна быть ошибка деления на ноль", Calculator.getResult());
    }
}

