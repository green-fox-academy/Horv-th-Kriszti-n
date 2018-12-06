package weather;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Weather {

  public static List<String> readFile() {
    try {
      Path source = Paths.get("cities.csv");
      List<String> data = Files.readAllLines(source);
      return data;
    } catch (Exception e) {
      System.out.println("Unable to read file! " + e.getMessage());
      return null;
    }
  }

  public static void getRainyCity(List<String> data){
    HashMap<String, Integer> rainyCities = new HashMap();
    for (int i = 0; i < data.size(); i++) {
      String[] weatherInfo = data.get(i).split(",");
      if (weatherInfo[2].equals("RAINY")) {
        if (rainyCities.containsKey(weatherInfo[1])) {
          int counterCity = rainyCities.get(weatherInfo[1] + 1);
          rainyCities.put(weatherInfo[1], counterCity);
        } else {
          rainyCities.put(weatherInfo[1], 1);
        }
      }
    }
    int max = 0;
    String city = "";
    for (Map.Entry cityData : rainyCities.entrySet()) {
    if ((int) cityData.getValue() > max){
      max = (int) cityData.getValue();
      city = (String) cityData.getKey();
      }
    }
    System.out.println(city);

  }


}
