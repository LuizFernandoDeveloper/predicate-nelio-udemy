package util;

import java.util.function.Predicate;

import model.Product;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.00;
    }
}
