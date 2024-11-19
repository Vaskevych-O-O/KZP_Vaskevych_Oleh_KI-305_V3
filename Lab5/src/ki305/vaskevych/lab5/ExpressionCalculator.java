package ki305.vaskevych.lab5;

/**
 * Клас ExpressionCalculator обчислює значення тригонометричного виразу.
 * У цьому випадку обчислюється тангенс від переданого аргументу.
 */
public class ExpressionCalculator {

    /**
     * Обчислює значення виразу sin(x) / cos(x).
     *
     * @param x значення в радіанах для обчислення виразу.
     * @return результат виразу sin(x) / cos(x).
     * @throws ArithmeticException якщо значення cos(x) дорівнює нулю, що спричиняє ділення на нуль.
     */
    public double calculate(double x) throws ArithmeticException {
        double cosValue = Math.cos(x);
        if (cosValue == 0) {
            throw new ArithmeticException("Ділення на нуль: cos(" + x + ") = 0");
        }
        return Math.sin(x) / cosValue;
    }
}
