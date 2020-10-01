package com.springapi.springapi.api;

import com.springapi.springapi.model.Person;
import com.springapi.springapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RequestMapping("addr")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @PostMapping
    public void addPerson( @RequestBody Person person) {
        personService.addPerson(person);
    }
    @GetMapping
    public List<Person> getAllPeople(){
        return personService.getAllPeople();
    }
}
