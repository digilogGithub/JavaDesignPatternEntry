package C13_Visitor;

import java.util.Iterator;

public class ListVisitor implements Visitor {
    private String currentDir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDir+"/"+file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir+"/"+directory);
        String saveDir = currentDir;
        currentDir = currentDir+"/"+directory.getName();
        Iterator<Entry> itr = directory.iterator();
        while (itr.hasNext()) {
            Entry entry = itr.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }

}
