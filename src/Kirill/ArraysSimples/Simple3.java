package Kirill.ArraysSimples;

import java.util.Scanner;

public class Simple3 {
    public static void main(String[] args) {
        /*
        построить матрицу и вывести на экран матрицу m * n
        (где m - кол-во строк, а  n -  кол-во элементов в строке)
        m и n вводим с клавиатуры
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во m и n ");
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] arr = new int [m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
