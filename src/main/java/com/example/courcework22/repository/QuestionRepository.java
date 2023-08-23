package com.example.courcework22.repository;




import com.example.courcework22.model.Question;

import java.util.List;

public interface QuestionRepository {
    Question add (String question, String answer);
    Question remove (Question question);
    List<Question> getAll();
}
