package C09_Bridge;

public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
