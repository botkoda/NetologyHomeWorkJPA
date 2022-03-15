package com.example.JPA.Repository;

import com.example.JPA.Entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class MainRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city){
        Query query=entityManager.createQuery("select p from Person p where p.CityOfLiving=:city",Person.class);
        query.setParameter("city",city);
        List resultList = query.getResultList();
        return resultList;
    }
}
