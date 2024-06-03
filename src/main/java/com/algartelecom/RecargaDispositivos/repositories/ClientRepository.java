package com.algartelecom.RecargaDispositivos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algartelecom.RecargaDispositivos.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
