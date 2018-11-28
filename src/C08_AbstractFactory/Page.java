package C08_AbstractFactory;

        import java.io.FileWriter;
        import java.io.IOException;
        import java.io.Writer;
        import java.util.ArrayList;
        import java.util.List;

public abstract class Page {
    protected String title;
    protected String author;
    protected List<Item> itemList = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        itemList.add(item);
    }

    public void output() {
        String fileName = "src/C08_AbstractFactory/OutputFileDir/" + title + ".html";
        try {
            Writer writer = new FileWriter(fileName);
            writer.write(this.makeHTML());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(fileName + "을 작성했습니다.");
    }

    public abstract String makeHTML();
}
