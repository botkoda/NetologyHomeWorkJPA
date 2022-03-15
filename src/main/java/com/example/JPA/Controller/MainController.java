package com.example.JPA.Controller;

import com.example.JPA.Entity.Person;
import com.example.JPA.Repository.MainRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {

    MainRepository mainRepository ;
    public MainController(MainRepository mainRepository) {
        this.mainRepository = mainRepository;

    }
    @GetMapping("persons/by-city")
    public List<Person> getName(@RequestParam("city") String name){
        return mainRepository.getPersonsByCity(name);
    }
}