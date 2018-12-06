import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
  Matrices matrix3 = new Matrices();

  int[][] matrix1 = {{2, 5, 3}, {0, 2, 7}, {3, 9, 0}};
  int[][] matrix2 = {{5, 5, 0}, {1, 9, 0}, {2, 4, 6}};

    System.out.println(Arrays.deepToString(matrix3.getMatrix(matrix1, matrix2)));
  }
}
