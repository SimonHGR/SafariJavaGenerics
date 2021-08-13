package shopping;

import java.time.LocalDate;

public class UseAPair {
  public static void main(String[] args) {
    Pair<String> names = new Pair<>("Fred", "Jones");

    String first = names.getLeft();

    Pair<LocalDate> pld = new Pair<>(LocalDate.now(), LocalDate.now());
    LocalDate r = pld.getRight();
  }
}
