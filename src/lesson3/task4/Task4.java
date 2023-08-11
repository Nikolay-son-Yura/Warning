package lesson3.task4;

public class Task4 {
    public static int checkArray(String[][] array) {
        if (array.length != 4 || array[0].length != 4) throw new MyArraySizeException(array.length, array[0].length);
        int sum = 0;
        for (String[] arr : array) {
            for (String i : arr) {
                try {
                    sum += Integer.parseInt(i);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException();
                }
            }
        }return sum;
    }
}

