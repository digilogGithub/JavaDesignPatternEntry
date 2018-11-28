package C07_Builder;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();
    private FileWriter fileWriter;
    private String fileName;

    @Override
    public void makeTitle(String title) {
        fileName = "src/C07_Builder/OutputFileDir/"+title+".txt";
        buffer.append("============================\n");
        buffer.append("[ "+title+" ]\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append('*'+str+"\n");
        buffer.append("\n");
    }

    @Override
    public void makeItem(String[] items) {
        for (String str :
                items) {
            buffer.append(" -"+str+"\n");
            buffer.append("\n");
        }
    }

    @Override
    public void close() {
        buffer.append("============================\n");
        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write(buffer.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getResult() {
        System.out.println("Make text file : "+fileName);
        return buffer.toString();
    }
}
