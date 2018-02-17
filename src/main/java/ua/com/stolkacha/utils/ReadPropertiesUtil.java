package ua.com.stolkacha.utils;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesUtil {
    private static String path = "src/main/resources/properties/properties.properties";

    public static String getProperty(String key) {
        Properties properties = new Properties();
        try (FileReader fileReader = new FileReader(path)) {
            properties.load(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }
}
