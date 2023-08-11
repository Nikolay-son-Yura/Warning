package lesson3.task4;

public class MyArraySizeException extends RuntimeException {
    public  MyArraySizeException(int row,int colum){
        super("Массив должен быть 4х4,размер вашего массива -> "+row+"x"+colum);
    }
    public  MyArraySizeException(){
        super("Массив должен быть 4х4");
    }

}
