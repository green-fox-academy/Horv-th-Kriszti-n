package strings;

public class String1 {
  public static void main(String[] args) {
  // Given a string, compute recursively (no loops) a new string where all the
  // lowercase 'x' chars have been changed to 'y' chars.
    System.out.println(getY("xAxBxCxDx"));
  }
  public static String getY(String xChange) {
    if (xChange.contains("x")){
      return xChange.replace("x", "y");
    }
    return "";
  }
}
