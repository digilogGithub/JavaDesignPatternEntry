package C15_Facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {

    public static Properties getInstance(String dbname) {
        String fileName = "src/C15_Facade/mailData/"+dbname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(fileName));
        } catch (IOException e) {
            System.out.println("Waring : "+fileName+" is not found.");
        }
        return prop;
    }

    private Database() {
    }
}
