package garden;

import java.util.ArrayList;

public class Garden {

  ArrayList<Plant> listOfPlants;

  Garden(ArrayList<Plant> newListOfPlants) {
    this.listOfPlants = newListOfPlants;
  }

  public void plantGetStatus() {
    for (Plant list : listOfPlants) {
      if (list.actualWaterLevel < list.maxWaterLevel){
        System.out.println("The " + list.color + list.type + " needs water");
      } else {
        System.out.println("The " + list.color + list.type + " doesn't needs water");
      }
    }
  }
  public void wateringPlant(double amountOfWater) {
    System.out.println("Watering with " + amountOfWater);
    int counter = 0;
    for (Plant list : listOfPlants) {
      if (list.actualWaterLevel < list. maxWaterLevel){
        counter++;
      }

    }
  }
}
