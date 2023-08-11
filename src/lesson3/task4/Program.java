package lesson3.task4;

public class Program {
    public static void main(String[] args) {
        String[][] array ={{"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"}};
        String[][] array1 ={{"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"}};
        String[][] array2 ={{"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","dfh","4"}};
        System.out.println(Task4.checkArray(array));
        try{
            System.out.println(Task4.checkArray(array1));
        }catch (MyArrayDataException | MyArraySizeException e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(Task4.checkArray(array2));
        }catch (MyArrayDataException | MyArraySizeException e){
            System.out.println(e.getMessage());
        }
    }
}
