package lesson3;

public class task1 {
    public  static void doSomething() throws Exception{

    }
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
