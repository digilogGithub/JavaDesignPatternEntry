package C13_Visitor;


public interface Visitor {
    void visit(File file);

    void visit(Directory directory);
}
