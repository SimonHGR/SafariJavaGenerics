package verify;

import java.util.function.Consumer;

public class Verify {
  public static void main(String[] args) {
    ((Consumer<String>)(var x)-> System.out.println(x)).accept("Hello World!");
  }
}
