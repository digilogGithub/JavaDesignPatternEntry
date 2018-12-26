package C18_Memento;

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
    
    List<String> getFruit() {
        return fruits;
    }

}
