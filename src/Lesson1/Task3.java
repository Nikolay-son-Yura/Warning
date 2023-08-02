package Lesson1;

public class Task3 {
    public static int sumElement(int[][]arr){

        if(arr[0].length!= arr.length)
            throw new RuntimeException("Массив не является квадратным");
        int sum = 0;
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                if (ints[j] != 0 && ints[j] != 1) {
                    throw new RuntimeException("элимент массива не 0 или 1");

                } else sum += ints[j];
            }
        }
        return sum;
    }

}
