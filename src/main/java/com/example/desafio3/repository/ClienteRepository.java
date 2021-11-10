package com.example.desafio3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	List<Cliente> findByNombreAndApellidos(String nombre, String apellidos);

}
