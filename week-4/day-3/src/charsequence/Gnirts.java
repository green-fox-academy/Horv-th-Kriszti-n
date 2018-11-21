package charsequence;

public class Gnirts implements CharSequence {
  public String example;

  Gnirts(String example) {
    this.example = example;
  }

  @Override
  public int length() {
    return example.length();
  }

  @Override
  public char charAt(int index) {
    return example.charAt(length() - index - 1);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return example.subSequence(start, end - 1);
  }
}
