package com.gmtommasini.workshopMongoDB.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmtommasini.workshopMongoDB.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping 	//@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User> >findAll(){
		User u1 = new User("1", "Maria", "Maria@gamil");
		User u2 = new User("2", "Mark", "Mark@gamil");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(u1, u2));
		
		return ResponseEntity.ok().body(list);
	}

}
