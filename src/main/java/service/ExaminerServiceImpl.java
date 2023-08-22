package service;



import model.Question;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private  final JavaQuestionService javaQuestionService;

    public ExaminerServiceImpl(@Qualifier("javaQuestionRepository")JavaQuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }

    @Override
    public List<Question> getQuestions(int amount) {
        if (amount <= javaQuestionService.getAll().size()) {
            List<Question> randomList = new ArrayList<>(List.of());
            for (int i = 0; i < amount; i++) {
                randomList.add(javaQuestionService.getRandomQuestion());
            }
            return randomList;
        } else {
            throw new ArithmeticException("Вопросов меньше");
        }
    }
}