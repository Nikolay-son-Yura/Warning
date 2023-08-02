package Lesson1;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void /**List<Integer>*/ checkArr(Integer[] arr) {
//        List<Integer> list = new ArrayList<>();
        StringBuilder sb =new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
//                list.add(i);
                sb.append(i).append(" ");
            }
        }
        if(sb.length()!=0)
            throw new RuntimeException("В массиве есть значения null под индексами : "+sb.toString());
//        return  list;
    }
}
