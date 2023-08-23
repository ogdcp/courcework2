package com.example.courcework22.service;



import com.example.courcework22.model.Question;

import java.util.List;

public interface ExaminerService {
    List<Question> getQuestions(int amount);
}