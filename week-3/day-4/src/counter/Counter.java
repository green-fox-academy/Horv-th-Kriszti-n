package counter;

public class Counter {
  public static void main(String[] args) {
    System.out.println(recCounter(5));
  }
  public static int recCounter(int n) {
    if (n != 0) {
      System.out.println(n);
      return recCounter(n - 1);
    }
    return 0;
  }
}
