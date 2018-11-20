package C04_FactoryMethod;

import java.util.List;

public abstract class Factory {
    public final Product create(String onwer) {
        Product product = createProduct(onwer);
        registerProduct(product);
        return product;
    }

    public abstract List<Product> getRegisterProduct();
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);

}
