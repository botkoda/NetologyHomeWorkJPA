package com.example.JPA.Entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Contact implements Serializable {
    private String Name;
    private String Surname;
    private int Age;


}
