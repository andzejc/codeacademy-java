package exams.documents;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Builder
@Getter
@Setter
public class ExamDoc {
    private UUID id;
    private String name;
    private Integer score;
}
