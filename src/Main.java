import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
      + "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, "
      + "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
      + "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. "
      + "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

  public static void main(String[] args) {
    int volume;
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < text.length(); i++) {

      if (map.get(text.charAt(i)) != null) {
        volume = map.get(text.charAt(i));
        map.put(text.charAt(i), volume + 1);
      } else
        map.putIfAbsent(text.charAt(i), 1);
      System.out.println(map);
    }

    System.out.println("\nCollections.max & min");
    System.out.println("Максимальное количество - [" + Collections.max(map.values()) + "]");
    System.out.println("Минимальное количество - [" + Collections.min(map.values()) + "]");
    System.out.println();


    int maxValue = -1;
    for (int value : map.values()) {
      if (value > maxValue) {
        maxValue = value;
      }
    }
  }
}