package shopping;

import java.util.function.BiPredicate;

public class ClothingPair<E extends Sized & Colored /*, String*/> extends Pair<E> {
//  java.lang.String s = "Hello";
//  String s = "Hello";

  public ClothingPair(E left, E right) {
    super(left, right);
  }

  public boolean matchByPredicate(BiPredicate<E, E> test) {
    return test.test(left, right);
  }

  public /*<F, G> */boolean matches() {
    return left.getSize() == right.getSize()
        && left.getColor().equals(right.getColor());
  }

  public static <E extends Sized & Colored> boolean match(E left, E right) {
    return left.getSize() == right.getSize()
        && left.getColor().equals(right.getColor());
  }
}
