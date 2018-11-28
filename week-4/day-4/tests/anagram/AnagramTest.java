package anagram;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  Anagram testWords = new Anagram();
  @Test
  public void anagramTestTrue() {
    assertTrue(testWords.isItAnagram("leader", "dealer"));
  }

  @Test
  public void anagramTestFalse() {
    assertFalse(testWords.isItAnagram("leader", "drugdealer"));
  }
}
