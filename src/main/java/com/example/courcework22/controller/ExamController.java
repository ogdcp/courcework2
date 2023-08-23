package com.example.courcework22.controller;




import com.example.courcework22.model.Question;
import com.example.courcework22.service.ExaminerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exam")
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping(path = "/getQuestions")
    public List<Question> getQuestions(@RequestParam int amount) {
        return examinerService.getQuestions(amount);
    }
}