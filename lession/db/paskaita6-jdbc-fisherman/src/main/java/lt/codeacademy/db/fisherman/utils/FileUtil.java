package lt.codeacademy.db.fisherman.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class FileUtil {

    public static Properties getProperties(String fileName) {
        try {
            InputStream inuStream = FileUtil.class.getClassLoader().getResourceAsStream(fileName);
            Properties props = new Properties();
            props.load(inuStream);

            return props;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
