package com.example.springcache.controller;

import com.example.springcache.entities.Person;
import com.example.springcache.repository.PersonRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping("/test")
public class namesController {
    final String units = "miliseconds";
    int num= 1;

    final static Logger logger = LoggerFactory.getLogger(namesController.class);

    @Autowired
    PersonRepo pr;

    @GetMapping("/names")
    @ResponseBody
    public List<Person> namesEndpoint(){
        long startTime = System.currentTimeMillis();

        List<Person> lp = (List<Person>) pr.findAll();

        long stopTime = System.currentTimeMillis();

        long elapsedTime = stopTime - startTime;
        logger.info("Response number:"  + num + " : " +  String.valueOf(elapsedTime) + " " + units);

        num++;
        return lp ;
    }
}
