package br.com.erudio.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.erudio.model.Person;

@Service
public class PersonService {
	
	private AtomicLong counter = new AtomicLong();
	
	public Person findById(Long id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Rafael");
		person.setLastName("santos");
		person.setAddress("Araraquara, SP");
		person.setGender("Male");
		
		return person;		
	}

}
