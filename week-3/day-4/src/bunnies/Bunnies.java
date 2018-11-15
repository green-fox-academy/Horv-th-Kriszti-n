package bunnies;

public class Bunnies {
  public static void main(String[] args) {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
      System.out.println(EarOfBunnies(5, 2));
  }
  public static int EarOfBunnies(int bunny, int ear){
    if (bunny == 0){
    return 0;
    }
    return ear + EarOfBunnies(bunny-1, ear);
  }
}
