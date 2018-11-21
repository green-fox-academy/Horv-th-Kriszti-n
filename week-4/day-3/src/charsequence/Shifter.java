package charsequence;

public class Shifter implements CharSequence{
  public String example;
  public int number;

  Shifter(String example, int number){
    this.example = example;
    this.number = number;
  }

  @Override
  public int length() {
    return example.length();
  }

  @Override
  public char charAt(int index) {
    return example.charAt(index + number);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return example.subSequence(start + number, end - number);
  }
}
