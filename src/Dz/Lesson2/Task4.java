package Dz.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) {
        //Задание 4
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст, кроме пустой строки");
        try {
            String str= reader.readLine();
            if(str.equals(""))throw new RuntimeException("кроме пустой строки");
        }catch (IOException e){
            throw new RuntimeException(e);

        }
    }
}
