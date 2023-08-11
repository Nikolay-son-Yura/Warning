package lesson3.Task3;

public class DivBuZero extends ArithmeticException {
    public DivBuZero() {
        super("Деление на 0");
    }
}
