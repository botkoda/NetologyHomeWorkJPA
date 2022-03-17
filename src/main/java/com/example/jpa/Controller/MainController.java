package com.example.jpa.Controller;

import com.example.jpa.Entity.Person;
import com.example.jpa.Repository.MainRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class MainController {

    private MainRepository mainRepository;

    public MainController(MainRepository mainRepository) {
        this.mainRepository = mainRepository;

    }

    @GetMapping("persons/by-city")
    public List<Person> getPersonByCityName(@RequestParam("city") String name) {
        return mainRepository.findByCityOfLiving(name);
    }

    @GetMapping("persons/by-age")
    public List<Person> getPersonByName(@RequestParam("age") int age) {
        return mainRepository.findByContactAgeLessThanOrderByContactAgeDesc(age);
    }

    @GetMapping("persons/by-name-surname")
    public Optional<Person> getPerson(@RequestParam("name") String name, @RequestParam("surname") String surname) {
        final Person entity = mainRepository.findByContactNameAndContactSurname(name, surname)
                .orElseThrow(() -> new EntityNotFoundException("Entity " + name + " " + surname + " not found"));
        return Optional.ofNullable(entity);
    }
}