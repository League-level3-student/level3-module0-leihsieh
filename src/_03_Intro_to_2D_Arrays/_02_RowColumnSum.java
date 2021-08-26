package _03_Intro_to_2D_Arrays;

public class _02_RowColumnSum {

    public int getSumByRow(int[][] matrix, int row) {
        return matrix[row][0]+matrix[row][1]+matrix[row][2];
    }
    
    public int getSumByColumn(int[][] matrix, int col) {
        return matrix[0][col]+matrix[1][col]+matrix[2][col];
    }
}
