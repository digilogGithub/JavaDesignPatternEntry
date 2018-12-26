package C15_Facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailAddr, String fileName) {
        Properties mailProperties = Database.getInstance("MailData");
        String userName = mailProperties.getProperty(mailAddr);
        try {
            HtmlWrite write = new HtmlWrite(new FileWriter("src/C15_Facade/mailData/"+fileName));
            write.title("Welcome to " + userName + "'s page!");
            write.paragraph(userName + "의 페이지에 오신 걸 환영합니다.");
            write.paragraph("메일을 기다리고 있습니다.");
            write.mailto(mailAddr, userName);
            write.close();
            System.out.println(fileName + " is created for " + mailAddr + " (" + userName + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
