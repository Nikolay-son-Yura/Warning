package lesson2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//Анна=8
//Елена=4
//Марина=8
//Владимир=?
//Константин=?
//иван=4

public class task1 {
    public static void main(String[] args) {
        writeToArr(change(readTOArr("text2.txt")), "text2.txt");
    }

    public static List<String[]> readTOArr(String filePatch) {
        List<String[]> str = new ArrayList<>();
        try {
            FileReader file = new FileReader(filePatch);
            BufferedReader bufferedReader = new BufferedReader(file);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                str.add(line.split("="));

//                for (String[] string:str) {
//                    System.out.println(String.join("",string));
//                }
            }
        } catch (IOException e) {
            System.out.println("ошибка прочтения файла: " + filePatch);
        }
        return str;
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static List<String[]> change(List<String[]> str) {
        for (String[] strings : str) {
            if (!strings[1].equals("?") && !isNumeric(strings[1])) {
                throw new RuntimeException("значение не знак вопроса и не число");
            } else if (strings[1].equals("?")) {
                strings[1] = Integer.toString(strings[0].length());
            }
//            for (String[] string:str) {
//                    System.out.println(String.join("",string));
//                }
        }
        return str;
    }

    public static boolean writeToArr(List<String[]> str, String filePatch) {
        try {
            FileWriter file = new FileWriter(filePatch);
            BufferedWriter bufferedWriter = new BufferedWriter(file);
            for (String[] strings : str) {
                bufferedWriter.write(strings[0] + "=" + strings[1]);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            return true;
        } catch (IOException e) {
            return false;

        }
    }
}
