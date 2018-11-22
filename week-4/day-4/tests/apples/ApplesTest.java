package apples;

import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

  @Test
  public void testGetApple() {
    Apples newApple = new Apples();
    assertEquals("apple", newApple.getApple());
  }
}
