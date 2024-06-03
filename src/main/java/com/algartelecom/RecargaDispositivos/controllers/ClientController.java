package com.algartelecom.RecargaDispositivos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algartelecom.RecargaDispositivos.dto.ClientDTO;
import com.algartelecom.RecargaDispositivos.services.ClientService;

@RestController
@RequestMapping(value = "/client")
public class ClientController {
	
	@Autowired
	private ClientService service;
	
	@GetMapping(value = "/{id}")
	public ClientDTO findById (@PathVariable Long id) {
		return service.findById(id);
	}
	
}
