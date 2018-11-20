package C04_FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List<Product> idCardList = new ArrayList<Product>();

    @Override
    protected Product createProduct(String owner) {
        System.out.println(owner+"의 카드를 만듭니다.");
        IDCard idCard = new IDCard(owner);
        return idCard;
    }

    @Override
    protected void registerProduct(Product product) {
        idCardList.add(product);
    }

    @Override
    public List<Product> getRegisterProduct() {
        return idCardList;
    }
}
