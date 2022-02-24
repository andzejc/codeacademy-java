package jackson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Skaitymas {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("target/adresas.json");


        try {
            JsonNode parent = new ObjectMapper().readTree(file);
            String content = parent.path("gatve").asText();
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }


//        try {
//            Adresas adresasIsJsonFailo = mapper.readValue(file, Adresas.class);
//            System.out.println(adresasIsJsonFailo);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
