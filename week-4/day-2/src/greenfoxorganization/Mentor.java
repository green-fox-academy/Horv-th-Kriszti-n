package greenfoxorganization;

public class Mentor extends Person {
  public String level;


  Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  Mentor() {
    super();
    level = "intermediate";
  }

  public void getGoal() {
    System.out.println("My goal is: Educate brilliant software developers.");
  }

  public void introduce() {       // <----The superclass will call in the getIntroduce from the Student class!
    System.out.println(super.getIntroduce() + " " + level + " mentor.");
  }
}
