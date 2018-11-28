package C17_Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class NumberGenerator {
    private List<Observer> observerList = new ArrayList<>();
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObserverList() {
        Iterator<Observer> itr = observerList.iterator();
        while (itr.hasNext()) {
            Observer observer = itr.next();
            observer.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}
