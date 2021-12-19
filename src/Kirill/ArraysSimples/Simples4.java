package Kirill.ArraysSimples;

import java.util.Arrays;

public class Simples4 {
    /*
       Мы вводим число означающее столбик.
        Программа должна посчитать количество отрицательных чисел в указанном слобике.
        */
// этот вариант смотрет нужно
     static int getNegativeOfNumbers(int [][] matrix, int summ) {
             summ = 0;
          int colum = 0;
         for (int i = 0; i < matrix.length; i++) {
             if (matrix[i][colum] < 0) {
                 summ+=1;

             }
         }
         return summ;
     }
    public static void main(String[] args) {
        /*
        Мы вводим число означающее столбик.
         Программа должна посчитать количество отрицательных чисел в указанном слобике.
         */
        int [][] matrix = {
                { -1,   2,   -3,    4,   -5,    6,   -7},
                {  8,  -9,   10,  -11,   12,  -13,   14},
                {-15,  16,  -17,   18,  -19,   20,  -21},
                { 22, -23,   24,  -25,   26,  -27,   28},
                {-29,  30,  -31,   32,  -33,   34,  -35}
        };
        int summ = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    summ +=1;
                }
            }

        }

        System.out.println(summ);
        //System.out.println(getNegativeOfNumbers(matrix, 5));
    }
}
