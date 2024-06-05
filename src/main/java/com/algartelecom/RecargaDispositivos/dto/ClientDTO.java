package com.algartelecom.RecargaDispositivos.dto;

import com.algartelecom.RecargaDispositivos.entities.Client;

public class ClientDTO {

	 private Long id;
	 private String name;
	 private String email;
	 private String phone;
	 
	public ClientDTO(Long id, String name, String email, String phone) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		email = entity.getEmail();
		phone = entity.getPhone();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	
	 
}
