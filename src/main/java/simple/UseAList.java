package simple;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseAList {
  public static void breakAList(List l) {
    l.add(0, LocalDate.now());
  }

  public static void main(String[] args) {
////    Class<?> stringType = String.class;
//    Class<?> stringType = "".getClass();
    List<String> names = Collections.checkedList(
        new ArrayList<>(List.of("Alice"/*, LocalDate.now()*/)
    ), String.class);
    names.add("Fred");
    names.add("Jim");
//    names.add(LocalDate.now());

    breakAList(names);

//    String nameOne = (String)names.get(0);
    String nameOne = names.get(0);
    System.out.println(names);
    System.out.println(nameOne);
  }
}
