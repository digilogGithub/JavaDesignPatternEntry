package C20_Flyweight;

public class BigString {
    private BigChar[] bigChars;

    public BigString(String string) {
        bigChars = new BigChar[string.length()];
        BigCharFactory bigCharFactory = BigCharFactory.getInstance();
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = bigCharFactory.getBigChar(string.charAt(i));
        }
    }

    public void print() {
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i].print();
        }
    }
}
