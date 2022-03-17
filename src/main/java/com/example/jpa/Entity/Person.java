package com.example.jpa.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @EmbeddedId
    private Contact contact;
    @Column(length = 11)
    private String phoneNumber;
    private String cityOfLiving;
}
