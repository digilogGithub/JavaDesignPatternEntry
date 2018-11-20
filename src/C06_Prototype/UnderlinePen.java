package C06_Prototype;

public class UnderlinePen implements Product {
    private char ulChar;

    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println();
        System.out.println("\""+s+"\"");
        for (int i = 0; i < length + 2; i++) {
            System.out.print(ulChar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
