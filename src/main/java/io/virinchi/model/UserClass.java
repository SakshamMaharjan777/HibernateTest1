package io.virinchi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//@annotations
@Entity  // this needs to a table in db no usage
public class UserClass
{
    @Id // PRIMARY KEY
    //auto increment
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

}
