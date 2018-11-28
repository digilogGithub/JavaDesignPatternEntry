package C07_Builder;

import java.io.*;

public class HTMLBuilder extends Builder {
    private String fileName;
    private FileWriter fileWriter;
    private StringBuffer buffer = new StringBuffer();
//    private PrintWriter printWriter;

    @Override
    public void makeTitle(String title) {
        fileName = "src/C07_Builder/OutputFileDir/"+title+".html";
        buffer.append("<html>\n<meta charset=\"UTF-8\">\n<head>\n<title>"+title+"</head>\n</title>\n<body>");
        buffer.append("<h1>"+title+"</h1>");
    }

    @Override
    public void makeString(String str) {
        buffer.append("<p>"+str+"</p>");
    }

    @Override
    public void makeItem(String[] items) {
        buffer.append("<ul>\n");
        for (String str :
                items) {
            buffer.append("<li>"+str+"</li>\n");
        }
        buffer.append("</ul>\n");
    }

    @Override
    public void close() {
        buffer.append("</body></html>");
        try {
            fileWriter = new FileWriter(new File(fileName));
            fileWriter.write(buffer.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getResult() {
        System.out.println("Make html file : "+fileName);
        return buffer.toString();
    }
}
