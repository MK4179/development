package com.telusko.SpringMVCDemo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.telusko.SpringMVCDemo.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>{
    
    List<Alien> findByName(String name);

    List<Alien> findAllByOrderByIdDesc();

    @Query("from Alien where name= :name")
    List<Alien> find(@Param("name") String name); 

}
