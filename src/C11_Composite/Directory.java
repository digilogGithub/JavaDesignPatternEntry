package C11_Composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    private String name;
    private ArrayList<Entry> directories = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size=0;
        Iterator<Entry> itr = directories.iterator();
        while(itr.hasNext()) {
            Entry entry = itr.next();
            size += entry.getSize();
        }

        return size;
    }

    @Override
    public Entry add(Entry entry) throws FileTreatmentException {
//        super.add(entry);
        directories.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix+"/"+this);
        Iterator<Entry> itr = directories.iterator();
        while (itr.hasNext()) {
            Entry entry = itr.next();
            entry.printList(prefix+"/"+name);
        }
    }
}
