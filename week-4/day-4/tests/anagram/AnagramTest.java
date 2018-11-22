package anagram;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  
  @Test
  public void anagramTestTrue() {
    Anagram testWords = new Anagram();
    assertTrue(testWords.isItAnagram("leader", "dealer"));
  }

  @Test
  public void anagramTestFalse() {
    Anagram testwords = new Anagram();
    assertFalse(testwords.isItAnagram("leader", "drugdealer"));
  }
}
