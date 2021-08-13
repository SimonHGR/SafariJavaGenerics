package shopping;

public class Shop {
  public static void main(String[] args) {
    ClothingPair<Shoe> ps = new ClothingPair<>(new Shoe(10, "Brown"), new Shoe(10, "Brown"));
    ClothingPair<Shoe> ps2 = new ClothingPair<>(new Shoe(9, "Brown"), new Shoe(10, "Brown"));
    ClothingPair<Shoe> ps3 = new ClothingPair<>(new Shoe(10, "Brown"), new Shoe(10, "Black"));

    System.out.println("ps matches? " + ps.matches());
    System.out.println("ps2 matches? " + ps2.matches());
    System.out.println("ps3 matches? " + ps3.matches());

    ClothingPair<Glove> cpg;

    System.out.println("proposed matches? "
        + ClothingPair.match(new Shoe(7, "Red"), new Shoe(7, "Red")));
//        + ClothingPair.<Shoe>match(new Shoe(7, "Red"), new Shoe(7, "Red")));
  }
}
