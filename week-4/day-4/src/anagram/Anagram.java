package anagram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

  public boolean isItAnagram(String one, String two) {
    char[] charOne = one.toCharArray();
    char[] charTwo = two.toCharArray();

    Arrays.sort(charOne);
    Arrays.sort(charTwo);

    return Arrays.equals(charOne, charTwo);
  }
}
