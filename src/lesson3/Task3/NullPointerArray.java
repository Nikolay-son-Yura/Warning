package lesson3.Task3;

public class NullPointerArray extends NullPointerException {
    public NullPointerArray(int index) {
        super("Обращение к пустому элементу в массиве запрещено,индекс элемента: " + index);
    }

    public NullPointerArray() {
        super("Обращение к пустому элементу в массиве запрещено");
    }
}
