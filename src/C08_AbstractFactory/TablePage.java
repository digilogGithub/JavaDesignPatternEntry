package C08_AbstractFactory;

import java.util.Iterator;

public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<html><meta charset=\"UTF-8\"><head><title>"+title+"</title></head>\n");
        stringBuffer.append("<body>\n");
        stringBuffer.append("<h1>"+title+"</h1>\n");
        stringBuffer.append("<table width=\"80%\" border=\"3\">\n");
        Iterator itr = itemList.iterator();
        while(itr.hasNext()) {
            Item item = (Item) itr.next();
            stringBuffer.append("<tr>"+item.makeHTML()+"</tr>");
        }
        stringBuffer.append("</table>\n");
        stringBuffer.append("<hr><address>"+author+"</address>");
        stringBuffer.append("</body></html>\n");
        return stringBuffer.toString();
    }
}
