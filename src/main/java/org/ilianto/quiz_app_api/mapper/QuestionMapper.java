package org.ilianto.quiz_app_api.mapper;

import org.ilianto.quiz_app_api.dto.QuestionDTO;
import org.ilianto.quiz_app_api.entity.Question;
import org.springframework.stereotype.Component;

@Component
public class QuestionMapper {
    public QuestionDTO toQuestionDTO(Question question) {
        return new QuestionDTO(question.getQuestion(),question.getOption1(), question.getOption2(), question.getOption3(), question.getOption4(),question.getCorrectOption());
    }
}
