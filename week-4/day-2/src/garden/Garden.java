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
        System.out.println("Actual water level: " + list.actualWaterLevel);
      } else {
        System.out.println("The " + list.color + list.type + " doesn't needs water");
        System.out.println("Actual water level: " + list.actualWaterLevel);
      }
    }
  }
  public void wateringPlant(double amountOfWater) {
    System.out.println("Watering with " + amountOfWater);
    ArrayList<Plant> thirstyPlants = new ArrayList<>();
    for (int i =0; i < listOfPlants.size(); i++) {            //<---- With this for loop we add to our thristyPlants arraylist, the plants which needs watering
      if (listOfPlants.get(i).actualWaterLevel < listOfPlants.get(i).maxWaterLevel) {
      thirstyPlants.add(listOfPlants.get(i));
      }
    }
    double watering = amountOfWater / thirstyPlants.size();
    for (int i = 0; i < thirstyPlants.size(); i++) {
      thirstyPlants.get(i).actualWaterLevel += watering * thirstyPlants.get(i).waterUsageEfficiency;
    }
  }
}
