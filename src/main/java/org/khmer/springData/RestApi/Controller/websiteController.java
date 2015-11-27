package org.khmer.springData.RestApi.Controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.khmer.springData.RestApi.Model.Person;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Produces(MediaType.TEXT_HTML)
public class websiteController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		
		return "Hello";
	}
}
