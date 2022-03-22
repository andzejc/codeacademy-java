package jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class Saugojimas {

    public static void main(String[] args) {
        Adresas adresas = new Adresas(Salis.LIETUVA, "Vilnius", "Gedimino");

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        File file = new File("target/adresas.json");
        try {
            mapper.writeValue(file, adresas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
