package lt.codeacademy.db.jdbc.utils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;

public final class FileUtil {

    public List<String> readFrom(String filePathWithName) {
        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(filePathWithName);
        if (resource == null) {
            throw new RuntimeException("file not found! " + filePathWithName);
        }

        try {
            File file = new File(resource.toURI());
            return Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }

        return Collections.emptyList();
    }
}
