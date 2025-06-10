package com.michaelj.tutorials.service;

import com.michaelj.tutorials.entity.Tutorial;

import java.util.List;

public interface TutorialService {
    List<Tutorial> findByPublished(boolean isPublished);
    List<Tutorial> findByTitleContaining(String title);

    List<Tutorial> findAll();

    Tutorial findById(Integer id);

    Tutorial save(Tutorial tutorial);

    void deleteById(int id);

    void deleteAll();

    Tutorial update(Integer id, Tutorial tutorial);



}
