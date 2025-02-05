package com.question.QuestionService.controller;

import com.question.QuestionService.model.Question;
import com.question.QuestionService.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController
{
    @Autowired
    private QuestionService questionService;

    @PostMapping
    public Question create(@RequestBody Question question)
    {
        return questionService.create(question);
    }

    @GetMapping
    public List<Question> getAll()
    {
        return questionService.getAll();
    }

    @GetMapping("/{id}")
    public Question getById(@PathVariable Long id)
    {
        return questionService.getById(id);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getByQuizId(@PathVariable Long quizId)
    {
        return questionService.getByQuizId(quizId);
    }
}
