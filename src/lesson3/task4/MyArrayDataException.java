package lesson3.task4;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException (int i,int j){
        super("Преобразование не удалось, индексы - > "+i+":"+j);
    }
    public MyArrayDataException (){
        super("В каком то элементе массива преобразование не удалось");
    }
}
