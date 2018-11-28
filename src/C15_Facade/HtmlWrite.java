package C15_Facade;

import java.io.IOException;
import java.io.Writer;

public class HtmlWrite {
    private Writer writer;

    public HtmlWrite(Writer writer) {
        this.writer = writer;
    }

    public void title(String title) throws IOException {
        writer.write("<html>");
        writer.write("<meta charset=\"UTF-8\">");
        writer.write("<head>");
        writer.write("<head>");
        writer.write("<body>\n");
        writer.write("<h1>"+title+"</h1>\n");
    }

    public void paragraph(String msg) throws IOException {
        writer.write("<p>"+msg+"</p>\n");
    }

    public void link(String href, String caption) throws IOException {
        writer.write("<a href=\""+href+"\">"+caption+"</a>");
    }

    public void mailto(String mailAddr, String userName) throws IOException {
        link("mailto:"+mailAddr, userName);
    }

    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }
}
