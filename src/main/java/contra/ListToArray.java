package contra;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
  public static <E, F extends E> E[] getAsArray(List<F> l, Class<E> cl) {
//    E [] rv = (E[])new Object[l.size()];
    E[] rv = (E[]) Array.newInstance(cl, l.size());
    for (int i = 0; i < rv.length; i++) {
      F f = l.get(i);
      rv[i] = f;
    }
    return rv;
  }

  public static void main(String[] args) {
    List<String> names = List.of("Fred", "Jim", "Sheila");
    CharSequence[] nameArray = getAsArray(names, CharSequence.class);
    nameArray[0] = new StringBuilder("Alice");
    System.out.println("type of nameArray " + nameArray.getClass());
    System.out.println("type of Object[] " + (new Object[]{}).getClass());
    System.out.println(Arrays.toString(nameArray));
  }
}
