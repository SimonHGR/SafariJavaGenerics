package shopping;

public class Glove implements Sized, Colored {
  int size;
  String color;

  public Glove(int size, String color) {
    this.size = size;
    this.color = color;
  }

  @Override
  public String getColor() {
    return color;
  }

  @Override
  public int getSize() {
    return size;
  }
}
