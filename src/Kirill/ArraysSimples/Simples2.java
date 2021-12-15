package Kirill.ArraysSimples;

import java.util.Random;

public class Simples2 {


    public static void main(String[] args) {
        /*
       сгенерировать 10 рандомных чисел. Числа должны быть не больше 1000
       эти числа засунут в массив и найти максимальное и минимальное число.
       Вывести их на консоль
         */

        Random random = new Random();
        int [] arr = new int[10];
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++ ){
            arr[i] = random.nextInt(30 + 20 +1) - 20 ;
            if (min > arr[i]){
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
            System.out.println("случайные значения " + arr[i]);
        }
        System.out.println("min " + min + "\n" + "max " + max);

    }
}
