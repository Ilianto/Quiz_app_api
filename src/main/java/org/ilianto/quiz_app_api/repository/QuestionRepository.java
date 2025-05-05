package org.ilianto.quiz_app_api.repository;

import org.ilianto.quiz_app_api.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}