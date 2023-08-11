import lesson3.Task3.DivBuZero;
import lesson3.Task3.NotFile;
import lesson3.Task3.NullPointerArray;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class program {
    public static void main(String[] args) throws NotFile {
        //        try(CountTask2 count = new CountTask2()){
//            count.add();;
//            count.add();
//            count.add();
//            count.add();
//            System.out.println(count.getCount());
//            count.close();
//            System.out.println(count.getCount());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());;
//        }

        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            try {
                throw new DivBuZero();
            }catch (DivBuZero ex){
                System.out.println(ex.getMessage());
            }

        }
        int i = 0;
        try {
            Integer[] array = {1, 2, 3, 4, null, 6, 7, 8, 9, 0};
            for (; i < array.length; i++) {
                System.out.println(array[i]);
                array[i]++;
            }
        } catch (NullPointerException e) {
            try{
                throw new NullPointerArray(i);

            }catch (NullPointerArray ex){
                System.out.println(ex.getMessage());
            }
        }
        String path = "kjfgkjdfg.txt";
        try (FileReader fr =new FileReader(path)){
            int a=7;
        } catch (FileNotFoundException e) {
            try{
                throw new NotFile(path);
            }catch (NotFile ex){
                System.out.println(ex.getMessage());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
