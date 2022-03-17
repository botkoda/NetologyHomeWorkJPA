package com.example.jpa.Repository;

import com.example.jpa.Entity.Contact;
import com.example.jpa.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

@Repository
public interface MainRepository extends JpaRepository<Person, Contact> {

    List<Person> findByCityOfLiving(String cityOfLiving);

    List<Person> findByContactAgeLessThanOrderByContactAgeDesc(int age);

    Optional<Person> findByContactNameAndContactSurname(String name, String surname);


}
