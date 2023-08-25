import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import model.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        List<Product> productsList = new ArrayList<>();

        productsList.add(new Product("Tv", 900.00));
        productsList.add(new Product("Mouse", 50.00));
        productsList.add(new Product("Tablet", 350.00));
        productsList.add(new Product("Hd Case", 80.90));

        productsList.removeIf(p -> p.getPrice() >= 100.00);

        for (Product product : productsList) {
            System.out.println(product);
        }

    }
}
