package repository;




import model.Question;

import java.util.List;

public interface QuestionRepository {
    Question add (String question, String answer);
    Question remove (Question question);
    List<Question> getAll();
}
