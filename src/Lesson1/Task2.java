package Lesson1;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static int warning(int[] args) {
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        System.out.println("Введите размер массива");
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt();
        }
        System.out.println("Введите минимум длины массива");
        int minn = scanner.nextInt();
        System.out.println("Введите искомый элемент массива");
        int num1 = scanner.nextInt();
        if (arr == null) {
            result = -3;
        } else {
            if (minn < arr.length)
                result = -1;
            else {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == num1) {
                        result = i;
//                System.out.println("Элемент найден его индекс =" + i);
                    } else {
                        result = -2;
                    }
                }
            }
        }
        return result;
    }

    public static int checkArray(int[] arr, int len, int value) {
        if (arr == null) return -3;
        if (arr.length < len) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -2;
    }

    public static String stringCode(int[] arr, int len, int value) {
        int code = checkArray(arr, len, value);
        if (code == -1) return "Длина массива(" + arr.length + ") меньше заданого минимума(" + len + ")";
        if (code == -2) return "Искомый элемент не найден(" + value + ")";
        if (code == -3) return "Вместо массива пришел null";
        return "Индекс элимента = "+code;
    }
}
