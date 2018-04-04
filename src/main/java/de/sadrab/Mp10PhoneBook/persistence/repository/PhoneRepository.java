package de.sadrab.Mp10PhoneBook.persistence.repository;

import de.sadrab.Mp10PhoneBook.persistence.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Person, Long> {
}
