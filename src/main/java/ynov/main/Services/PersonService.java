package ynov.main.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;
import ynov.main.Entity.Person;
import ynov.main.Entity.PersonRepository;
import ynov.main.Entity.Pouvoir;
import ynov.main.Entity.Dto.CreatePersonDto;
import ynov.main.Exception.CustomException;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PouvoirService pouvoirService;

    public Person createPerson(CreatePersonDto dto) {
        Person p = new Person();
        long nb = personRepository.findAll().size();
        p.setId(nb);
        p.setName(dto.getName());
        return personRepository.save(p);
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
    public Pouvoir addPower(@Valid Long personId, @Valid Long pouvoirId) {
        Person p = personRepository.findById(personId).get();
        Pouvoir pouvoir = pouvoirService.findById(pouvoirId);
        if(p == null || pouvoir == null)
            throw new CustomException("Person or power not found");
        p.getPowers().add(pouvoir);
        personRepository.save(p);
        return pouvoir;
    }
}
