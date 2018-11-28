package C13_Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private List<Entry> directoryList = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entry> itr = directoryList.iterator();
        while (itr.hasNext()) {
            Entry entry = itr.next();
            size += entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry) {
        directoryList.add(entry);
        return this;
    }

    public Iterator iterator() {
        return directoryList.iterator();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
