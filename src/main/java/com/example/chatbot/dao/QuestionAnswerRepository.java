package com.example.chatbot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.chatbot.entity.QuestionAnswer;

public interface QuestionAnswerRepository extends JpaRepository<QuestionAnswer, Long> {

    QuestionAnswer findByQuestion(String question);
}


