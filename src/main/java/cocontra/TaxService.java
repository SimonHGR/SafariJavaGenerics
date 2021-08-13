package cocontra;

import java.util.ArrayList;
import java.util.List;

public class TaxService {
  public static void processTaxes(Taxable t) {}
  public static <E extends Taxable> void processBulkTaxes(List<E> lt) {
//    lt = new ArrayList<Corporation>();
//    E it = new Corporation();
//    lt.add(new Corporation());
//    lt.add(new Taxable());
//    lt.add(new Individual());
    for (Taxable t : lt) {
      processTaxes(t);
    }
  }

  public static void main(String[] args) {
    List<Taxable> lt = List.of(
        new Corporation(), new Corporation(),
        new Individual(), new Corporation()
    );
    processBulkTaxes(lt);

    List<Individual> joesClients = List.of(
        new Individual(), new Individual()
    );

    processBulkTaxes(joesClients);
//    processBulkTaxes(List.<String>of());
  }
}
