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
    System.out.println("Educate brilliant software developers.");
  }

  public void introduce() {
    super.introduce();
  }

  public String getIntroduce() {
    return super.getIntroduce() + " " + level + " mentor.";
  }
}
