package com.michaelj.tutorials.controller;

import com.michaelj.tutorials.entity.Tutorial;
import com.michaelj.tutorials.service.TutorialService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class TutorialController {
    private TutorialService tutorialService;

    public TutorialController(TutorialService tutorialService) {
        this.tutorialService = tutorialService;
    }

    private static final Logger logger = LoggerFactory.getLogger(TutorialController.class);

    @GetMapping("/tutorials")
    public List<Tutorial> getAllTutorials() {
        logger.info("getAllTutorials");
        List<Tutorial> tutorials = tutorialService.findAll();
        return tutorials;
    }

    @GetMapping("/tutorials/{id}")
    public Tutorial getTutorialById(@PathVariable Integer id) {
        logger.info("getTutorialById");
        Tutorial tutorial = tutorialService.findById(id);
        return tutorial;
    }

    @PostMapping("/tutorials")
    public Tutorial createTutorial(@RequestBody Tutorial tutorial) {
        logger.info("createTutorial");
        logger.info("add tutorial {}", tutorial);
        return tutorialService.save(tutorial);
    }

    @PutMapping("/tutorials/{id}")
    public Tutorial updateTutorial(@PathVariable Integer id, @RequestBody Tutorial tutorial) {
        logger.info("updateTutorial");
        return tutorialService.update(id, tutorial);
    }

    @DeleteMapping("/tutorials/{id}")
    public void deleteTutorial(@PathVariable Integer id) {
        logger.info("deleteTutorial");
        tutorialService.deleteById(id);
    }

    @DeleteMapping("/tutorials")
    public void deleteAllTutorials() {
        logger.info("deleteAllTutorials");
        tutorialService.deleteAll();
    }

    @GetMapping("/tutorials/published")
    public List<Tutorial> findByPublished() {
        logger.info("findByPublished");
        return tutorialService.findByPublished(true);
    }

    @GetMapping("/tutorials/title/{title}")
    public List<Tutorial> findByTitle(@PathVariable String title) {
        logger.info("findByTitle");
        return tutorialService.findByTitleContaining(title);
    }

}
