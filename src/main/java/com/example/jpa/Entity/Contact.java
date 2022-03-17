package com.example.jpa.Entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Contact implements Serializable {
    private String name;
    private String surname;
    private int age;


}
