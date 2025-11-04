package com.telusko.SpringMVCDemo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.telusko.SpringMVCDemo.model.Alien;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @Autowired
    AlienRepo repo;

    @ModelAttribute
    public void modeData(Model m) {
        m.addAttribute("name", "Aliens");
    }
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m) {
        int num3 = i + j;
        m.addAttribute("num3", num3);
        return "result";  
    }


    @GetMapping(value="getAliens")
    public String getAliens(Model model) {
        
        // Alien alien = new Alien();
        // alien.setId(101);
        // alien.setName("Mohit");
        // alien.setTech("Java");
        
        // Alien alien1 = new Alien();
        // alien1.setId(102);
        // alien1.setName("Prajakta");
        // alien1.setTech("Python");

        // List<Alien> aliens = new ArrayList<>();
        // aliens.add(alien);
        // aliens.add(alien1);


        model.addAttribute("result", repo.findAllByOrderByIdDesc());
        return "showAliens";
    }

    @GetMapping(value="getAlien")
    public String getAliens(@RequestParam int id, Model model) {
        
        // Alien alien = new Alien();
        // alien.setId(101);
        // alien.setName("Mohit");
        // alien.setTech("Java");
        
        // Alien alien1 = new Alien();
        // alien1.setId(102);
        // alien1.setName("Prajakta");
        // alien1.setTech("Python");

        // List<Alien> aliens = new ArrayList<>();
        // aliens.add(alien);
        // aliens.add(alien1);


        model.addAttribute("result", repo.findById(id));
        return "showAliens";
    }

    @GetMapping(value="getAlienByName")
    public String getAlienByName(@RequestParam String name, Model model) {
    model.addAttribute("result", repo.find(name));

        return "showAliens";
    }

        @PostMapping(value="addAlien")
        public String addAlien(@ModelAttribute("a1") Alien a) {
            repo.save(a);
            return "result";  
        }
    }

