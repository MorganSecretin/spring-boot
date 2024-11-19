package ynov.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import ynov.main.Entity.Person;
import ynov.main.Entity.Pouvoir;
import ynov.main.Entity.Dto.CreatePersonDto;
import ynov.main.Entity.Dto.CreatePouvoirDto;
import ynov.main.Exception.CustomException;
import ynov.main.Services.PersonService;
import ynov.main.Services.PouvoirService;

@RestController
public class MainController {
    @Autowired
    private PouvoirService pouvoirService;
    @Autowired
    private PersonService personService;

    @GetMapping()
    @ResponseBody
    public String mainPage() {
        throw new CustomException("This is a custom exception");
        //return "<h1 style=\"color: red;\">HELLO MOTHER FUGOLEON</h1>";
    }

    @PostMapping("/power")
    public Pouvoir createPower(@Valid @RequestBody CreatePouvoirDto dto) {
        System.out.println(dto);
        return pouvoirService.createPower(dto);
    }

    @GetMapping("/power")
    public List<Pouvoir> getAllPowers() {
        return pouvoirService.getAllPowers();
    }

    @PostMapping("/person")
    public Person createPerson(@Valid @RequestBody CreatePersonDto dto) {
        System.out.println(dto);
        return personService.createPerson(dto);
    }

    @GetMapping("/person")
    public List<Person> getPerson() {
        return personService.getAllPersons();
    }

    @PostMapping("/person/power")
    public Pouvoir createPower(@Valid @RequestBody Long personId, @Valid @RequestBody Long pouvoirId) {
        return personService.addPower(personId, pouvoirId);
    }
}
