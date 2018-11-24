package piratesreloaded;

import java.util.ArrayList;

public class Ship {

  ArrayList<Pirate> shipCrew = new ArrayList<>();
  int captainIndex;

  public void fillShip() {
    int crewSize = 10 + (int) (Math.random() * 21);
    for (int i = 0; i < crewSize; i++) {
      shipCrew.add(new Pirate());
    }
    Pirate Captain = new Pirate();   // <---- this is how we get our Captain!
    shipCrew.add(Captain);
    captainIndex = shipCrew.size() - 1;
  }

  private int captainsRum() {
    return shipCrew.get(captainIndex).drinksHad;  // <--- this how we identify the index of our Captain
  }

  private int crewAlive() {
    int crewAlive = 0;
    for (int i = 0; i < shipCrew.size(); i++) {
      if (shipCrew.get(i).isAlive) {
        crewAlive++;
      }
    }
    return crewAlive;
  }

  /*public String toString() {  <--- always String!
    String returnText = "";*/
  public void statusOfShip() {
    if (shipCrew.get(captainIndex).isAlive) {
      System.out.print("The captain is alive ");
      if (shipCrew.get(captainIndex).isConscious) {
        System.out.println("and awake.");
      } else {
        System.out.println("but passed out.");
      }
      if (captainsRum() == 0) {
        System.out.println("The captain is sober!!! Is the rum all gone?");
      } else {
        System.out.println("The captain had " + captainsRum() + " rum.");
      }
      if (shipCrew.get(captainIndex).pet != "") {
        System.out.println("The captain also has a pet " + shipCrew.get(captainIndex).pet + ".");
      }
    } else {
      System.out.println("The captain is dead!");
    }
    System.out.println("The ship has " + crewAlive() + " alive crew members.");
  }

  public void winnersCelebration() {
    for (int i = 0; i < crewAlive() - 1; i++) {
      if (shipCrew.get(i).isCapable()) {
        shipCrew.get(i).drinksHad += (int) (Math.random() * 6);
      }
    }
  }
  public void losersPunishment() {
    for (int i = 0; i < shipCrew.size(); i++) {
      if (shipCrew.get(i).isAlive) {
        shipCrew.get(i).isAlive = Math.random() * 2 >= 1;
      }
    }
  }

  public boolean battle(Ship opponent) {
    int score = crewAlive() - captainsRum() - opponent.crewAlive() + opponent.captainsRum();
    if (score > 0) {
      this.winnersCelebration();
      opponent.losersPunishment();
    } else {
      opponent.winnersCelebration();
      this.losersPunishment();
    }
    return score > 0;
  }

}








