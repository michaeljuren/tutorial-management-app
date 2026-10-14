package com.michaelj.tutorials.serviceImpl;

import com.michaelj.tutorials.dao.TutorialRepository;
import com.michaelj.tutorials.entity.Tutorial;
import com.michaelj.tutorials.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TutorialServiceImpl implements TutorialService {
    private TutorialRepository tutorialRepository;

    @Autowired
    public TutorialServiceImpl(TutorialRepository tutorialRepository) { this.tutorialRepository = tutorialRepository; }


    @Override
    public List<Tutorial> findByPublished(boolean isPublished) {
        return tutorialRepository.findByPublished(isPublished);
    }

    @Override
    public List<Tutorial> findByTitleContaining(String title) {
        return tutorialRepository.findByTitleContaining(title);
    }

    @Override
    public List<Tutorial> findAll() {
        return tutorialRepository.findAll();
    }

    @Override
    public Tutorial findById(Integer id) {
        Optional<Tutorial> result = tutorialRepository.findById(id);

        Tutorial tutorial = null;
        if (result.isPresent()){
            tutorial = result.get();
        }
        else{
            throw new RuntimeException("NO ID FOUND " + id);
        }

        return tutorial;
    }

    @Override
    public Tutorial save(Tutorial tutorial) {
        return tutorialRepository.save(tutorial);
    }

    @Override
    public void deleteById(int id) {
        tutorialRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        tutorialRepository.deleteAll();
    }

    @Override
    public Tutorial update(Integer id, Tutorial tutorial) {
        Tutorial dbTutorial = tutorialRepository.findById(id).get();

        dbTutorial.setTitle(tutorial.getTitle());
        dbTutorial.setDescription(tutorial.getDescription());
        dbTutorial.setPublished(tutorial.isPublished());

        return tutorialRepository.save(dbTutorial);
    }
}
