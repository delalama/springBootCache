package com.example.springcache.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    private String name;
    private String codName;

    public Person() {
    }

    public Person(long id , String name, String codName) {
        this.id = id;
        this.name = name;
        this.codName = codName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodName() {
        return codName;
    }

    public void setCodName(String codName) {
        this.codName = codName;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", codName='" + codName + '\'' + '}';
    }

}
