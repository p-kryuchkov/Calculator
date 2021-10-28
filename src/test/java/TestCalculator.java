import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    @Test
    public void testCheckSum() {
        Calculator firstNumber = new Calculator(3, 12, "+");
        assertEquals("Сложение считается неверно, верный ответ: 15", 15, Calculator.getResult(), 0);
    }
    @Test
    public void testCheckSub() {
        Calculator firstNumber = new Calculator(18, 22, "-");
        assertEquals("Вычитание считается неверно, верный ответ: -4", -4, Calculator.getResult(), 0);
    }
    @Test
    public void testCheckMult() {
        Calculator firstNumber = new Calculator(16, 27, "*");
        assertEquals("Умножение считается неверно, верный ответ: 432", 432, Calculator.getResult(), 0);
    }
    @Test
    public void testCheckDiv() {
        Calculator firstNumber = new Calculator(78, 3, "/");
        assertEquals("Деление считается неверно, верный ответ: 26", 26, Calculator.getResult(), 0);
    }
    @Test
            (expected = ArithmeticException.class)
    public void testArithmeticException() {
        Calculator firstNumber = new Calculator(18, 0, "/");
        assertEquals("Должна быть ошибка деления на ноль", Calculator.getResult());
    }
}

