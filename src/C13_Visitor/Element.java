package C13_Visitor;

public interface Element {
    void accept(Visitor visitor);
}
