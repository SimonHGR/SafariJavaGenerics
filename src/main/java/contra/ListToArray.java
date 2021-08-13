package contra;

import java.util.Arrays;
import java.util.List;

public class ListToArray {
  public static <E> E[] getAsArray(List<E> l) {
    E [] rv = new E[l.size()];
    for (int i = 0; i < rv.length; i++) {
      rv[i] = l.get(i);
    }
    return rv;
  }

  public static void main(String[] args) {
    List<String> names = List.of("Fred", "Jim", "Sheila");
    String [] nameArray = getAsArray(names);
    System.out.println(Arrays.toString(nameArray));
  }
}
