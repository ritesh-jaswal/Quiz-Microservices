package com.question.QuestionService.service;

import com.question.QuestionService.model.Question;

import java.util.List;

public interface QuestionService
{
    Question create(Question question);

    List<Question> getAll();

    Question getById(Long id);

    List<Question> getByQuizId(Long quizId);
}
