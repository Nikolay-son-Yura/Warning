package Lesson1;

public class Task1 {



    public static int arrLength(int[] arg){
        int num=1;
        if(arg.length>num) return arg.length;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={};
        System.out.println(arrLength(arr));

    }
}
