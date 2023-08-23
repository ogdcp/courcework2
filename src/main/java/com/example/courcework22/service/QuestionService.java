package com.example.courcework22.service;





import com.example.courcework22.model.Question;

import java.util.List;

public interface QuestionService {
    Question add (String question, String answer);
    Question add (Question question);
    Question remove (Question question);
    List<Question> getAll();
    Question getRandomQuestion ();

}
