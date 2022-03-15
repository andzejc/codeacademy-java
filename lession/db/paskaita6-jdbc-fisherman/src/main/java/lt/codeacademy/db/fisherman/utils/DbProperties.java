package lt.codeacademy.db.fisherman.utils;

import java.util.Properties;

public class DbProperties extends Properties {

    private final Properties props = FileUtil.getProperties("database.properties");

    @Override
    public String getProperty(String key) {
        if (props != null) {
            if (props.getProperty(key) == null) {
                return System.getProperty(key);
            }
            return props.getProperty(key);
        }

        return null;
    }

    public boolean isRemoveDataWhenInit() {
        return Boolean.parseBoolean(this.getProperty("database.removeDataWhenInit"));
    }
}
