package com.example.demo.Person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTest 
{
	@GetMapping("randomEndpoint")
	public String GetPersonData() 
	{
		Person person = new Person();
		person.setFirstName("Bram");
		person.setLastName("Dingetje");
		return person.getFirstName() + " : " + person.getLastName();
	}
	
}