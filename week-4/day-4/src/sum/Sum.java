package sum;

import java.util.ArrayList;
import java.util.List;

public class Sum {


  public int getSum(ArrayList<Integer> listOfNumbers) {
    int sum = 0;
    for (int i = 0; i < listOfNumbers.size(); i++) {
      sum += listOfNumbers.get(i);
    }
    return sum;
  }

  public int getSum2(List<Integer> listOfNumbers) {
    int sum = 0;
    for (Integer number : listOfNumbers) {        // <--- method with foreach!
      sum += number;
    }
    return sum;
  }
}

