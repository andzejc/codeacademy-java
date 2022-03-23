package exams.service;

import exams.documents.ExamDoc;
import exams.exception.DocumentNotChanged;
import exams.repository.ExamRepository;
import lombok.RequiredArgsConstructor;
import org.bson.Document;

import java.util.UUID;


@RequiredArgsConstructor
public class ExamsService {

    private final ExamRepository examRepository;

    public void createExamDocument(ExamDoc examDoc) {
        // creating a new document
        Document newExam = new Document()
                .append("_id", examDoc.getId().toString())
                .append("name", examDoc.getName())
                .append("score", examDoc.getScore());
        examRepository.insertExam(newExam);
    }

    public ExamDoc findById(UUID id) {
        Document examDocument = examRepository.findById(id);
        return ExamDoc.builder()
                .id(UUID.fromString(examDocument.getString("_id")))
                .name(examDocument.getString("name"))
                .score(examDocument.getInteger("score"))
                .build();
    }

    public ExamDoc updateExamScoreByIdAndReturn(UUID id, int newScore) {
        // update and validate if updated
        long resultsUpdated = examRepository.updateExamScoreById(id, newScore).getModifiedCount();
        if (resultsUpdated == 0) {
            throw new DocumentNotChanged("Exam was not updated. Exam with ID: " + id + " was not found!");
        }
        return findById(id);
    }

    public void deleteById(UUID id) {
        boolean wasDeleted  = examRepository.deleteById(id);
        if (!wasDeleted) {
            throw new DocumentNotChanged("Exam was not deleted. Exam with ID: " + id + " was not found!");
        }
    }
}
