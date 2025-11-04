package com.telusko.SpringMVCDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.SpringMVCDemo.model.Alien;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class AlienController {
    
    @Autowired
    AlienRepo repo;

    @GetMapping(path="aliens", produces = {"application/xml"})
    public List<Alien> getAliens() {
        List<Alien> aliens =repo.findAll();
       System.out.println("Aliens are::"+aliens.toString());
        return aliens;
    }
    
    @GetMapping("alien/{id}")
    public Alien getAlien(@PathVariable("id") int id) {
        Alien alien = new Alien();
        alien.setId(190);
        alien.setName("Test Name");
        alien.setTech("Chat GPT");

        return repo.findById(id).orElse(alien);
    }

    @PostMapping(path="alien", consumes = {"application/json"}) 
    public Alien addAlien(@RequestBody Alien alien) {
        repo.save(alien);
        return alien;
    }
}
