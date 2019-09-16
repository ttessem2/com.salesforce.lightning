package Test_Salesforce_Lightning_Test_Pages;


import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Config {

    private static final Logger LOG = Logger.getLogger(Config.class.getName());

    public static Properties properties() {
        Properties properties = new Properties();
        try {
            properties.load(Config.class.getClassLoader().getResourceAsStream("config.properties"));
            LOG.log(Level.INFO, "Properties loaded successfully.");
        } catch (IOException e) {
            LOG.log(Level.SEVERE, e.getMessage(), e);
        }
        return properties;
    }

}