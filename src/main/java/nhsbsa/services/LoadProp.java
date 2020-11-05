package nhsbsa.services;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp {

    //get data from test Data file
    static Properties prop;
    static FileInputStream input;
    static String file = "src/test/resources/testData/config.properties";

    public String loadProperties(String key) {
        prop = new Properties();
        try {
            input = new FileInputStream(file);
            prop.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
