package com.example.courcework22.service;



import com.example.courcework22.model.Question;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import com.example.courcework22.repository.QuestionRepository;

import java.util.List;
import java.util.Random;
@Repository
public class MathQuestionService implements QuestionService {
    private final QuestionRepository mathQuestionRepository;

    public MathQuestionService(@Qualifier("mathQuestionRepository") QuestionRepository mathQuestionRepository) {
        this.mathQuestionRepository = mathQuestionRepository;
    }

    @Override
    public Question add(String question, String answer) {
        return mathQuestionRepository.add(question, answer);
    }


    @Override
    public Question add(Question question) {
//        mathList.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        return mathQuestionRepository.remove(question);
    }

    @Override
    public List<Question> getAll() {
        return mathQuestionRepository.getAll();
    }

    @Override
    public Question getRandomQuestion() {
        Random random = new Random();
        int randomInt = random.nextInt(getAll().size());
        return getAll().get(randomInt);
    }
}
