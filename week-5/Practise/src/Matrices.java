public class Matrices {

  public static int[][] getMatrix(int[][] matrix1, int[][] matrix2){
    int[][] matrix3 = new int[3][3];
    for (int i = 0; i < matrix1.length; i++) {
      for (int j = 0; j < matrix1.length  ; j++) {
        if (matrix1[i][j] < matrix2[i][j]){
          matrix3[i][j] = matrix2[i][j];
        } else {
          matrix3[i][j] = matrix1[i][j];
        }
      }
    }
    return matrix3;
  }
}
