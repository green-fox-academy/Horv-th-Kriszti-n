package sumdigit;

public class SumDigit {
  public static void main(String[] args) {
    // Given a non-negative int n, return the sum of its digits recursively (no loops).
    // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
    // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    System.out.println(sumOfN(126));

  }

  public static int sumOfN(int n) {
    if (n == 0) {
      return 0;
    }
    return n % 10 + sumOfN(n / 10);
  }
}

