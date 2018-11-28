package C08_AbstractFactory;

import java.util.Iterator;

public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<td>\n");
        stringBuffer.append("<table width=\"100%\" boader=\"1\"><tr>\n");
        stringBuffer.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\""+trayList.size() + "\"><b>" + caption+"</b></td>\n");
        stringBuffer.append("</tr>\n");
        stringBuffer.append("<tr>\n");
        Iterator itr = trayList.iterator();
        while(itr.hasNext()) {
            Item item = (Item) itr.next();
            stringBuffer.append(item.makeHTML());
        }
        stringBuffer.append("</tr></table>\n");
        stringBuffer.append("</td>\n");
        return stringBuffer.toString();
    }
}
