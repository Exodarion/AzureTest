package com.example.demo.Person;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@CrossOrigin (maxAge = 3600)
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
	
	@GetMapping("randomEndpoint2")
	public Person GetPersonData2() 
	{
		Person person = new Person();
		person.setFirstName("Bram2");
		person.setLastName("Boog2");
		return person;
	}
}
