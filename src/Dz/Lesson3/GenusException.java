package Dz.Lesson3;

public class GenusException extends Throwable {
//    public GenusException() {
//
//    }

    public void GenusException(String i) {
        System.out.println("Exception: GenusNotCorrectData");
        System.out.printf("It`s not correct data: %s", i);
        System.out.println();
    }
}
