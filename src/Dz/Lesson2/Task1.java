package Dz.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) {
        //Задание 1
        boolean flag = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (flag) {
            try {
                System.out.println("Введите дробное число");
                float num = Float.parseFloat(reader.readLine());
                System.out.println(num);
                flag = false;
            } catch (NumberFormatException | IOException e) {
                System.out.println("Ведены символы а не числа");
                System.out.println();
            }
        }
    }
}
