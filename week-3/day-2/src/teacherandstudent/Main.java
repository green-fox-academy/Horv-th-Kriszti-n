package teacherandstudent;

public class Main {
  public static void main(String[] args) {
    Student krisztian = new Student();
    Teacher blanka = new Teacher();

    krisztian.question(new Teacher());
    blanka.teach(new Student());
  }
}

