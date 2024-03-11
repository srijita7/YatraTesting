package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
    private static final String CONFIG_FILE_PATH = "/config/browser.properties";
    private static Properties properties;

    static {
    
        Properties properties=new Properties();
        try (FileInputStream inputStream = new FileInputStream(CONFIG_FILE_PATH)) {
            try {
                properties.load(inputStream);
            } catch (IOException e) {
                LoggerHandler.logError("could not load property file");
            }
        } catch (IOException e) {
            LoggerHandler.logError("file not found");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static String getBrowserName() {
        return getProperty("browsername");
    }
}
