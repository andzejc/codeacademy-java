import exams.documents.ExamDoc;
import exams.repository.ExamRepository;
import exams.service.ExamsService;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        ExamsService examsService = new ExamsService(new ExamRepository());

        UUID id = UUID.randomUUID();
        System.out.println("generated id" + id);
        ExamDoc request = ExamDoc.builder()
                .id(id)
                .name("Izabele")
                .score(10)
                .build();

        examsService.createExamDocument(request);

        System.out.println(examsService.findById(id).getName()); // will print java test

        ExamDoc updatedKazys = examsService.updateExamScoreByIdAndReturn(id, 9);
        System.out.println("Document with name: " + updatedKazys.getName() + " score was updated to: " + updatedKazys.getScore());

        examsService.deleteById(id);
    }
}
