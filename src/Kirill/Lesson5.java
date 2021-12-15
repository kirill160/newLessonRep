package Kirill;

public class Lesson5 {
    public static void main(String[] args) {

        int[][] ytr = {{1,2,3}, {4,5,6}, {7,8,9}};
        for (int i = 0; i <= ytr.length -1; i++){
            for (int j = 0; j < ytr[i].length; j++) {
//                if(i == j){
//                     ytr[i][j] = 0;
//                }
                System.out.print(ytr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
