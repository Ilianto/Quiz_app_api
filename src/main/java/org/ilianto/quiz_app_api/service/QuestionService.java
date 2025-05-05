package org.ilianto.quiz_app_api.service;

import org.ilianto.quiz_app_api.dto.QuestionDTO;
import org.ilianto.quiz_app_api.entity.Question;
import org.ilianto.quiz_app_api.mapper.QuestionMapper;
import org.ilianto.quiz_app_api.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionService {
    private final QuestionMapper questionMapper;
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionMapper questionMapper, QuestionRepository questionRepository) {
        this.questionMapper = questionMapper;
        this.questionRepository = questionRepository;
    }

    public List<QuestionDTO> getAllQuestions() {
        return questionRepository.findAll().stream().map(questionMapper::toQuestionDTO).collect(Collectors.toList());
    }
}
