package sum;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {


  @Test
  public void getSumTest() {
    // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)); <---other solution to make an arraylist with numbers
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    Sum tool = new Sum();     //<--- Sum class has its own automatically generated constructor(every class has its own one)

    assertEquals(45, tool.getSum(list));
  }

  @Test
  public void emptyList() {
    ArrayList<Integer> list = new ArrayList<>();
    Sum tool = new Sum();
    assertEquals(0, tool.getSum(list));
  }

  @Test
  public void oneElement() {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    Sum tool = new Sum();
    assertEquals(1, tool.getSum(list));
  }

  @Test
  public void multipleElements() {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(6);
    list.add(4);
    list.add(7);
    list.add(5);
    Sum tool = new Sum();
    assertEquals(25, tool.getSum(list));
  }

  @Test
  public void nullElement() {
    ArrayList<Integer> list = new ArrayList<>();
    Sum tool = new Sum();
    assertEquals(0, tool.getSum(list));
  }
}
