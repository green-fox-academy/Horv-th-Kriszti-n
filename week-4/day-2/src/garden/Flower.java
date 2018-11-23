package garden;

public class Flower extends Plant {

  Flower(String type, String color){
    this.type = type;
    this.color = color;
    this.maxWaterLevel = 5;
    this.waterUsageEfficiency = 0.75;
    this.actualWaterLevel = 0;
  }
}
