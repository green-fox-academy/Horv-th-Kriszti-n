package numberadder;

public class NumberAdder {
  public static void main(String[] args) {
  addNumber(5);
    System.out.println(addNumber(10));
  }
  public static int addNumber(int n){
    if (n == 10)
      return 10;
    else {
      System.out.println(n);
      return addNumber(n + 1);
    }
  }
}
