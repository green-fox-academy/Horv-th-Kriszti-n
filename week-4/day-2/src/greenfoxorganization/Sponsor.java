package greenfoxorganization;

public class Sponsor extends Person {
  public String company;
  public int hiredStudents;

  Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  Sponsor() {
    super();
    company = "Google";
    hiredStudents = 0;
  }

  public void introduce() {      // <--- this is an other solution, for the introduce method
    System.out.println(super.getIntroduce() + " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public int hire() {
    return hiredStudents++;
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }
}
