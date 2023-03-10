package propertie;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesOperations {

    private PropertiesOperations() {
    }

    private static final Properties properties = new Properties();

    public static String getPropertyValueByKey(String key) {
        String value = getSetupPropertyFile(key);
        if (value.isEmpty()) {
            try {
                throw new IllegalArgumentException(String.format("Value is not specified for key: %s in properties file.", key));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return value;
    }

    private static String getSetupPropertyFile(String key) {
        try (FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir").concat(String.format("%ssrc%stest%sresources%sconfig.properties", File.separator, File.separator, File.separator, File.separator)))) {
            properties.load(fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties.get(key).toString();
    }
}
