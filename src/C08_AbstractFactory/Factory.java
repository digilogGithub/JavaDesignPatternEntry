package C08_AbstractFactory;

import sun.font.FontConfigManager;

public abstract class Factory {

    public static Factory getInstance(String className) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(className).newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("클래스 " + className + "이 발견되지 않습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }


    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
