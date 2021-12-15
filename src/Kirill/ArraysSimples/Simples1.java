package Kirill.ArraysSimples;

public class Simples1 {
    public static void main(String[] args) {
        int[] arr = new int [10];
        arr[0] = 5;
        arr[1] = 3;
        arr[2] = 25;
        arr[3] = 98;
        arr[4] = 12;
        arr[5] = 23;
        arr[6] = 75;
        arr[7] = 18;
        arr[8] = 1;
        arr[9] = 23;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i % 2 != 0){
                arr[i] = 0;
                System.out.println(arr[i]);
        }
        }
    }
}
