package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configReader {
    public static String read(String path,String key) throws IOException {

        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        return properties.getProperty(key);

    }
}

