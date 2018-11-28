package C08_AbstractFactory;


import java.util.Iterator;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<li>\n");
        stringBuffer.append(caption+"\n");
        stringBuffer.append("<ul>\n");

        Iterator itr = trayList.iterator();
        while(itr.hasNext()) {
            Item item = (Item) itr.next();
            stringBuffer.append(item.makeHTML());
        }
        stringBuffer.append("</ul>\n");
        stringBuffer.append("</li>\n");
        return stringBuffer.toString();
    }
}
