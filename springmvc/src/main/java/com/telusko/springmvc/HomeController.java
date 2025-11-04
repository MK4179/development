package com.telusko.springmvc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.telusko.springmvc.dao.AlienDao;
import com.telusko.springmvc.model.Alien;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @Autowired
    private AlienDao alienDao;
    
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

    @GetMapping("getAliens")
    public String getAliens(Model m) {

        m.addAttribute("result", alienDao.getAliens());
        return "showAliens";
    }
    
    @GetMapping("getAlien")
    public String getAliens(@RequestParam int id, Model m) {

        m.addAttribute("result", alienDao.getAlien(id));
        return "showAliens";
    }

    
        @RequestMapping("addAlien")
        public String addAlien(@ModelAttribute("result") Alien alien) {
            alienDao.addAlien(alien);
            return "showAliens";  
        }
    }

