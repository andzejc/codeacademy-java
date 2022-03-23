package exams.exception;

public class DocumentNotChanged extends RuntimeException {
    public DocumentNotChanged(String message) {
        super(message);
    }
}
