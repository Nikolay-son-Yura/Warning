package lesson3.Task3;

import java.io.FileNotFoundException;

public class NotFile extends FileNotFoundException {
    public NotFile(String path) {
        super("Открыть несуществующий файл нельзя,ваш путь к файлу-> " + path);
    }

    public NotFile() {
        super("Открыть несуществующий файл нельзя");
    }
}
