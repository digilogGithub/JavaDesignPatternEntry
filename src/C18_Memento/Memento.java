package C18_Memento;

import sun.plugin2.message.MouseEventMessage;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    int money;
    public List<String> fruits;
    public int getMoney() {
        return money;
    }
    
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }
    
    void addFruit(String fruit) {
        fruits.add(fruit);
    }
    
    List getFruit() {
        return (List) new ArrayList<>(fruits);
//        return (List) fruits;
    }

}
