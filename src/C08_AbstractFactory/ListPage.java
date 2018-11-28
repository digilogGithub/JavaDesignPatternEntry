package C08_AbstractFactory;

import java.util.Iterator;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<html><meta charset=\"UTF-8\"><head><title>"+title+"</title></head>\n");
        stringBuffer.append("<body>\n");
        stringBuffer.append("<h1>"+title+"</h1>\n");
        stringBuffer.append("<ul>\n");
        Iterator itr = itemList.iterator();
        while(itr.hasNext()) {
            Item item = (Item) itr.next();
            stringBuffer.append(item.makeHTML());
        }
        stringBuffer.append("</ul>\n");
        stringBuffer.append("<hr><address>"+author+"</address>");
        stringBuffer.append("</body></html>\n");
        return stringBuffer.toString();
    }
}
