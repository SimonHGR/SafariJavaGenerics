package cocontra;

import java.util.ArrayList;
import java.util.List;

public class TaxService {
  public static void processTaxes(Taxable t) {}
  // ? extends is Java's way of expressing co-variance
  public static void processBulkTaxes(List<? extends Taxable>  lt) {
//  public static <E extends Taxable> void processBulkTaxes(List<E> lt) {
//    lt = new ArrayList<Corporation>();
//    E it = new Corporation();
//    lt.add(new Corporation());
//    lt.add(new Taxable());
//    lt.add(new Individual());
    for (Taxable t : lt) {
      processTaxes(t);
    }
  }

  // ? super... is Java's way of expressing "contravariance"
  public static void getIndividualClients(List<? super Individual> li) {
    li.add(new Individual()); // assign an individual to the formal parameter of add
    li.add(new Individual());
    li.add(new Individual());
//    Individual in = li.get(0);
  }

  // List<Individual> in Java is "invariant" that is, ONLY List<Individual>
  // is assignment compatible (in terms of the GENERIC part)
  // EXCEPT that ArrayList<Individual> is assignement compatible

  public static void main(String[] args) {
    List<Taxable> lt = List.of(
        new Corporation(), new Corporation(),
        new Individual(), new Corporation()
    );
    getIndividualClients(lt);
    processBulkTaxes(lt);

    List<Individual> joesClients = List.of(
        new Individual(), new Individual()
    );

    getIndividualClients(joesClients);
    processBulkTaxes(joesClients);
//    processBulkTaxes(List.<String>of());
  }
}
