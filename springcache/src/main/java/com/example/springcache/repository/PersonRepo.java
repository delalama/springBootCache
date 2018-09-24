package com.example.springcache.repository;

import com.example.springcache.entities.Person;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepo extends CrudRepository<Person, Long> {

    @Override
    @Cacheable("persons")
    public List<Person> findAll();

}
