package com.michaelj.tutorials.dao;

import com.michaelj.tutorials.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialRepository extends JpaRepository<Tutorial, Integer> {
    List<Tutorial> findByPublished(boolean isPublished);

    List<Tutorial> findByTitleContaining(String title);
}
