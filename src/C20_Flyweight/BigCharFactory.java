package C20_Flyweight;

import java.util.HashMap;

public class BigCharFactory {
    private HashMap<String,BigChar> pool = new HashMap();

    private static BigCharFactory ourInstance = new BigCharFactory();

    public static BigCharFactory getInstance() {
        return ourInstance;
    }

    private BigCharFactory() {
    }

    public synchronized BigChar getBigChar(char charName) {
        BigChar bigChar = pool.get("" + charName);
        if (bigChar == null) {
            bigChar = new BigChar(charName);
            pool.put("" + charName, bigChar);
        }
        return bigChar;
    }
}
