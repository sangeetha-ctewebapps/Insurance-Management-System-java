package com.vinay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinay.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{
	
	/**
	 * 
	 * @param email: this para is client email in client we are first check this client email able in database or not 
	 * if client email not able in database then throw a particular exception. if able then fetch all about client
	 * about information
	 * @return: after fetch all info return the same info in this method.
	 */
	Client findByEmail(String email);

}
