package garden;

public class Tree extends Plant {
  Tree(String type, String color) {
    this.type = type;
    this.color = color;
    this.maxWaterLevel = 10;
    this.waterUsageEfficiency = 0.4;
    this.actualWaterLevel = 0;
  }
}
