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
        int[] arrays = new int[5 * 7];
        int crt = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                arrays[crt++] = matrix[i][j];
            }
            Arrays.sort(arrays);
        }
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                matrix[i][j] = arrays[crt++];
            }
            Arrays.sort(arrays);
        }
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }

        }
    }
}
