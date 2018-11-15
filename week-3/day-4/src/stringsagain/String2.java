package stringsagain;

public class String2 {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.
    String given = "xIxamxAwesomex";
    System.out.println(xRemove(given));
  }
  public static String xRemove(String given){
    if (given.contains("x"));
    return given.replace("x", " ");
  }
}
