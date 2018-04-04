package de.sadrab.Mp10PhoneBook.endpoint;

import de.sadrab.Mp10PhoneBook.persistence.model.Address;
import de.sadrab.Mp10PhoneBook.persistence.model.Person;
import de.sadrab.Mp10PhoneBook.persistence.repository.PhoneRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class PhoneBook {
    private PhoneRepository phoneRepository;

    public PhoneBook(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @GetMapping
    List<Person> showAll() {
        return phoneRepository.findAll();
    }

    @PostMapping
    Person save(@RequestBody Person person){
        return phoneRepository.save(person);
    }

    @GetMapping("/load")
    Person load(){
        return phoneRepository.save(new Person("sadra",new Address("Haus Panprama")));
    }
}
