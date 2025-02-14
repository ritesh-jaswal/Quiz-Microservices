package com.quiz.QuizService.service;

import com.quiz.QuizService.model.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(url = "http://localhost:8082",value = "Question-Client") //Without Load Balancer
@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionClient
{
    @GetMapping("/question/quiz/{quizId}")
    List<Question> getQuestionOfQuiz(@PathVariable Long quizId);
}
