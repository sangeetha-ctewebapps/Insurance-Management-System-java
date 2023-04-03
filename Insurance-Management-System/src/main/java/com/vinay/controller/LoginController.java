package com.vinay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinay.dto.ClientDto;
import com.vinay.model.Client;
import com.vinay.service.ClientService;

@RestController
public class LoginController {

	@Autowired
	private ClientService clientService;
	
	@GetMapping("/signIn")
	public ResponseEntity<ClientDto>  getLoggedInClientDetailsHandler(Authentication auth ){
		ClientDto client = clientService.findByEmail(auth.getUsername());
		return new ResponseEntity<ClientDto>(client, HttpStatus.OK);
	}

}
