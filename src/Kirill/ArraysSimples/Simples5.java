package Kirill.ArraysSimples;

import java.util.Arrays;

public class Simples5 {

    public static void main(String[] args) {
        /*
        взять массив из прошлого задания и отсортировать по возрастанию
         */
        int[][] matrix = {
                {-1, 2, -3, 4, -5, 6, -7},
                {8, -9, 10, -11, 12, -13, 14},
                {-15, 16, -17, 18, -19, 20, -21},
                {22, -23, 24, -25, 26, -27, 28},
                {-29, 30, -31, 32, -33, 34, -35}
        };
        int[] arrays = createBigArray(matrix);
        Arrays.sort(arrays);
        for (int i : arrays) {
            System.out.println(i);
        }
        int e = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = arrays[e++];
            }

        }
        int m = 5;

    }
    public static int [] createBigArray (int [][] matrix ){
        int[] arrays = new int[35];
        int e = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                arrays[e++] = matrix[i][j];

            }
        }

        return arrays;
    }

}
