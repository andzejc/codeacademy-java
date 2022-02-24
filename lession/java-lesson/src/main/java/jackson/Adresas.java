package jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Adresas {
    @JsonProperty("country")
    private Salis salis;
    private String miestas;
    private String gatve;
}
