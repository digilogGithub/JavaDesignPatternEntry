package C04_FactoryMethod;

public class IDCard implements Product {
    private String owner;

    public IDCard(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner+"의 카드를 사용합니다.");
    }

    public String getOnwer() {
        return owner;
    }
}
