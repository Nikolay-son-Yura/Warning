package Dz.Lesson3;

public class DataException extends Exception {
    public DataException() {
    }

    public void dataException(String i) {
        System.out.println("Exception: DataNotCorrectFormat");
        System.out.printf("Это не правильный формат: %s", i);
        System.out.println();
    }
}
