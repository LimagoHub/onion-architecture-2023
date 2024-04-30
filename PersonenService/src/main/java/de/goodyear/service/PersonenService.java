package de.goodyear.service;

import de.goodyear.model.Person;

import java.util.Optional;
import java.util.UUID;

public interface PersonenService {

    void speichern(Person person) throws PersoneServiceException;
    boolean aendern(Person person) throws PersoneServiceException;

    boolean loesche(Person person) throws PersoneServiceException;
    boolean loesche(UUID id) throws PersoneServiceException;

    Optional<Person> findeNachId(UUID id) throws PersoneServiceException;

    Iterable<Person> findeAlle() throws PersoneServiceException;
}
