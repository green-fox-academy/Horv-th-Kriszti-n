package garden;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<Plant> plantsInTheGarden = new ArrayList<>();

    Garden firstGarden = new Garden(plantsInTheGarden);

    firstGarden.listOfPlants.add(new Flower("Flower", "yellow "));
    firstGarden.listOfPlants.add(new Flower("Flower", "blue "));
    firstGarden.listOfPlants.add(new Tree("Tree", "purple "));
    firstGarden.listOfPlants.add(new Tree("Tree", "orange "));

    firstGarden.plantGetStatus();
    System.out.println();
    firstGarden.wateringPlant(40);
    firstGarden.plantGetStatus();
    System.out.println();
    firstGarden.wateringPlant(70);
    firstGarden.plantGetStatus();


  }
}
