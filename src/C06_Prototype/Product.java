package C06_Prototype;

public interface Product extends Cloneable {
    void use(String s);
    Product createClone();
}
