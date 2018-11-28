package C08_AbstractFactory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        String title = null;
        boolean menu = true;
        int selectedFactory = 0;
        Factory factory = null;
        Scanner scanner = new Scanner(System.in);
        while (menu) {
            System.out.println("Select Link page or Table Link Page.");
            System.out.println("1. Link Page");
            System.out.println("2. Table Link Page");
            System.out.println("3. Quit");
            System.out.print("select : ");

            selectedFactory = scanner.nextInt();
            if (selectedFactory == 1 || selectedFactory == 2 || selectedFactory == 3)
                menu = false;
            else
                System.out.println("Must select 1 ,2 or 3");
        }


        if (selectedFactory == 1) {
            factory = Factory.getInstance("C08_AbstractFactory.ListFactory");
            title = "LinkPage";
        }
        else if (selectedFactory == 2) {
            factory = Factory.getInstance("C08_AbstractFactory.TableFactory");
            title = "TablePage";
        }
        else {
            System.out.println("종료합니다");
            System.exit(0);
        }


        Link joins = factory.createLink("중앙일보", "http://www.joins.com/");
        Link chosun = factory.createLink("조선일보", "http://www.chosun.com/");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        Link excite = factory.createLink("NAVER", "http://www.naver.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray trayNews = factory.createTray("신문");
        trayNews.add(joins);
        trayNews.add(chosun);

        Tray trayYahoo = factory.createTray("Yahoo!");
        trayYahoo.add(us_yahoo);
        trayYahoo.add(jp_yahoo);

        Tray traySearch = factory.createTray("검색엔진");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage(title, "영진닷컴");
        page.add(trayNews);
        page.add(traySearch);
        page.output();

    }


}
