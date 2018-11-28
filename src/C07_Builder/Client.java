package C07_Builder;

public class Client {
    public static void main(String[] args) {
        Builder textBuilder = new TextBuilder();
        Builder htmlBuilder = new HTMLBuilder();

        Director director = new Director(textBuilder);

        System.out.println("Text Builder");
        director.construct();
        String result = ((TextBuilder)textBuilder).getResult();
        System.out.println(result);

        director.setBuilder(htmlBuilder);
        System.out.println("HTML Builder");
        director.construct();
        result = ((HTMLBuilder)htmlBuilder).getResult();
        System.out.println(result);
    }
}
