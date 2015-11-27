package org.khmer.springData.RestApi.Controller;

import java.util.List;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.khmer.springData.RestApi.Model.Person;
import org.khmer.springData.RestApi.Repository.PersonRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class personController {
	
	@Resource
	 private PersonRepository repository;
	
	 static Logger log = Logger.getLogger(personController.class);

	 // get a record by people id
	@RequestMapping(value="/person/{people_id}", method=RequestMethod.GET)
	public Person getPerson(@PathVariable("people_id") Long people_id) {
		Person he = repository.findOne(people_id);
		return he;
	}
	
	// get all people records
	@RequestMapping(value="/person", method=RequestMethod.GET)
	public List<Person> getPeople(){
		List<Person> peopleList = repository.findAll();
		return peopleList;
	}
	
	//create a new record for person
	@RequestMapping(value="/person", method=RequestMethod.POST)
	public Person createPerson(@RequestBody Person he){
		log.info(he);
		Person him = repository.save(he);
		return him;
	}
	
	// Delete a person record
	@RequestMapping(value="/person/{person_id}", method=RequestMethod.DELETE)
	public Long deletePerson(@PathVariable("person_id") Long person_id) {
		repository.delete(person_id);
		return person_id;
	}
	
	
}
