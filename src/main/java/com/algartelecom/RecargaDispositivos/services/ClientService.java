package com.algartelecom.RecargaDispositivos.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.algartelecom.RecargaDispositivos.dto.ClientDTO;
import com.algartelecom.RecargaDispositivos.entities.Client;
import com.algartelecom.RecargaDispositivos.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Client client = repository.findById(id).get();
		return new ClientDTO(client);
	}
	
}
