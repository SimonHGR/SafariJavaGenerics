package bridge;

import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ExampleOne {
  // method overloading
  public void doStuff(int x) {}
  public void doStuff(long x) {}
  public void doStuff(List<String> x) {}
//  public void doStuff(List<LocalDate> x) {}

  public static void main(String[] args) throws Throwable {
    List<String> ls = new ArrayList<>();
    List<LocalDate> ls2 = new ArrayList<>();

//    if (ls instanceof List<String>) {
    if (ls instanceof List) {
      System.out.println("it's a list");
    }

//    Class<? extends Object>
    Class<?> cl = ExampleOne.class;
    Method m = cl.getDeclaredMethod("doStuff", List.class);
    System.out.println(m);
  }
}
