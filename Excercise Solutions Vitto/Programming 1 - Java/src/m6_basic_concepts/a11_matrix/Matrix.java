package m6_basic_concepts.a11_matrix;

public class Matrix {
    public static void main(String[] args) {
        int [][] mat = new int[4][6];

        for (int row = 0; row < mat.length; row++) {
            for (int column = 0; column < mat[row].length; column++) {
                mat[row][column] = (row+1)*(column+1);
            }
        }

        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[row].length; col++) {
               System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }

    }
}
