package bunniesagain;

public class Bunny2 {
  public static void main(String[] args) {
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
    // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
    // have 3 ears, because they each have a raised foot. Recursively return the
    // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

    System.out.println(NormalBunnies(5, 2) + MutantBunnies(5, 3));
    //System.out.println(earCounterHardCore(3, 2,3));

  }
  public static int NormalBunnies(int bunny,int ear) {
    if (bunny == 0) {
      return 0;
    }
    return ear + NormalBunnies(bunny-1, ear);
  }
  public static int MutantBunnies(int bunny, int ear) {
    if (bunny == 0) {
      return 0;
    }
    return ear + MutantBunnies(bunny - 1, ear);
  }

}

  /*public static int earCounterHardCore(int nrOfBunnies, int oddBunniesEars, int evenBunnieEars) {

    if (nrOfBunnies == 0) {
      return 0;
    } else if (nrOfBunnies % 2 == 0) {                                    <---Another solution !!!
      return earCounterHardCore(nrOfBunnies - 1, 2, 3) + evenBunnieEars;
    }
    return earCounterHardCore(nrOfBunnies - 1,2,3) + oddBunniesEars;
  }
  */

