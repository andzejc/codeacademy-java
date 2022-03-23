package exams.repository;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;

import java.util.UUID;

import static com.mongodb.client.model.Filters.eq;

public class ExamRepository {

    private static final String DB_NAME = "students";
    private static final String DB_COLLECTION = "exams";
    private final MongoCollection<Document> collection = getCollection();

    public void insertExam(Document newExam) {
        collection.insertOne(newExam);
    }

    public Document findById(UUID id) {
        return collection.find(eq("_id", id.toString())).first();
    }

    public UpdateResult updateExamScoreById(UUID id, int newScore) {
        return collection.updateOne(eq("_id", id.toString()), Updates.set("score", newScore));
    }

    public boolean deleteById(UUID id) {
        return collection.deleteOne(eq("_id", id.toString())).wasAcknowledged();
    }

    /**
     * @return collection of this repository
     */
    private MongoCollection<Document> getCollection() {
        // FIXME: config should come from .properties/.yaml file
//        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://root:example@localhost:27017"));  //<< if mongodb use user and password
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        return mongoClient.getDatabase(DB_NAME).getCollection(DB_COLLECTION);
    }
}
