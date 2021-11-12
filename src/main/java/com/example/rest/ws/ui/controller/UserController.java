package com.example.rest.ws.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.ws.ui.model.request.UserDetailsRequestModel;
import com.example.rest.ws.ui.model.response.UserRest;

@RestController
@RequestMapping("users")

public class UserController {
	
	Map<String, UserRest> users;
	
	@GetMapping
	public String getUser(@RequestParam(value = "page", defaultValue = "1", required=false ) int page,  @RequestParam(value = "limit", defaultValue = "50") int limit) {
		return "get user page = " +page +"\t  limit =  "+ limit;
	}

	@GetMapping(path="{userId}",
			produces = {
					MediaType.APPLICATION_XML_VALUE , 
					MediaType.APPLICATION_JSON_VALUE
					})
	public ResponseEntity<UserRest> getUser(@PathVariable String userId) {

		if(users.containsKey(userId)) {
		return new ResponseEntity<>(users.get(userId),HttpStatus.BAD_REQUEST);
		}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);	
		}
	}

	@PostMapping(consumes = {
			MediaType.APPLICATION_XML_VALUE , 
			MediaType.APPLICATION_JSON_VALUE
	},
	produces = {
			MediaType.APPLICATION_XML_VALUE , 
			MediaType.APPLICATION_JSON_VALUE
	})
	public ResponseEntity<UserRest> createUser(@Valid @RequestBody UserDetailsRequestModel userDetails) {
		
		
		
		UserRest response = new UserRest();
		response.setLastName(userDetails.getLastName());
		response.setFirstName(userDetails.getFirstName());
		response.setEmail(userDetails.getEmail());
		response.setPassword(userDetails.getPassword());
	//	System.out.println(userDetails);
		
		String userId = UUID.randomUUID().toString();
		if (users == null) users = new HashMap<>();
		users.put(userId, response);
		
		
		return new ResponseEntity<UserRest>(response, HttpStatus.OK);
	}

	@PutMapping
	public String updateUser() {
		return "Update User";
	}
	@DeleteMapping
	public String deleteUser() {
		return "delete User";
	}
}
