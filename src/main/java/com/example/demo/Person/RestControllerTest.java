package com.example.demo.Person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTest 
{
	@GetMapping("randomEndpoint")
	public Person GetPersonData() 
	{
		Person person = new Person();
		person.setFirstName("Bram");
		person.setLastName("Boog");
		return person;
	}
	
}
