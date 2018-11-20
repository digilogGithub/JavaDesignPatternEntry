package C06_Prototype;

import java.util.HashMap;

public class Manager {
    private HashMap showCase = new HashMap();
    public void register(String name, Product product) {
        showCase.put(name, product);
    }

    public Product create(String protoName) {
        Product product = (Product) showCase.get(protoName);
        return product.createClone();
    }
}
