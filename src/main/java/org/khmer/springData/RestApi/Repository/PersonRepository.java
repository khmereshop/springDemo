package org.khmer.springData.RestApi.Repository;

import java.util.List;

import org.khmer.springData.RestApi.Model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface PersonRepository extends CrudRepository <Person,Long> {
  
	public Person findByfirstName (String firstname);
	
	public Person findBylastName (String lastname);
	
	public Person findOne(Long user_id);
	
	
	public List<Person> findAll();
	
	//public Person save (String gender, String firstName, String lastName, String street, String city, String state, String zipCode);
	
}
