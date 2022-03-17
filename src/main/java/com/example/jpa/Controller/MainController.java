package com.example.jpa.Controller;

import com.example.jpa.Entity.Person;
import com.example.jpa.Repository.MainRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {

    private MainRepository mainRepository;

    public MainController(MainRepository mainRepository) {
        this.mainRepository = mainRepository;

    }

    @GetMapping("persons/by-city")
    public List<Person> getName(@RequestParam("city") String name) {
        return mainRepository.getPersonsByCity(name);
    }
}