package Kirill.ArraysSimples;

public class Simples6 {
    public static void main(String[] args) {
        int[][] matrix = {
                {-1, 2, -3, 4, -5, 6, -7},
                {8, -9, 10, -11, 12, -13, 14},
                {-15, 16, -17, 18, -19, 20, -21},
                {22, -23, 24, -25, 26, -27, 28},
                {-29, 30, -31, 32, -33, 34, -35}
        };
        createBigArray(matrix);

    }
    public static int [] createBigArray ( int [][] arrayMatrix) {
        int[] arrays = new int[35];
        int e = 0;
        for (int i = 0; i < arrayMatrix.length; i++) {
            for (int j = 0; j < arrayMatrix[i].length; j++) {
                arrays[e++] = arrayMatrix[i][j];
            }
        }
        return arrays;
    }
    private static  int [] sortBubblesMatrix(int [][] arrayMatrixOne ) {
        int [] arrays = createBigArray(arrayMatrixOne);
        for (int i = 0; i < arrays.length ; i++) {


            }
return arrays;
        }

    }


