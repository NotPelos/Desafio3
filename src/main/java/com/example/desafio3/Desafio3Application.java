package com.example.desafio3;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.desafio3.repository.Cliente;
import com.example.desafio3.services.ClienteServiceImpl;

@SpringBootApplication
public class Desafio3Application implements CommandLineRunner {
	
	@Autowired
	private ClienteServiceImpl clienteServicio;

	public static void main(String[] args) {
		SpringApplication.run(Desafio3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Cliente cliente1 = new Cliente("Juan Francisco","Gimenez",Date.valueOf("1980/04/25"),"12345678A");
		Cliente cliente2 = new Cliente("Luis","Garcia",Date.valueOf("1950/25/18"),"87654321B");
		
		clienteServicio.addCliente(cliente1);
		clienteServicio.addCliente(cliente2);
		
		String nombre = "Roberto";
		String apellidos = "Garrido";
		System.out.println("Buscar por nombre "+nombre+" y apellidos "+apellidos+":");
		List<Cliente> filtroNombre = clienteServicio.findByCompleteName(nombre, apellidos);
		for (Cliente cliente : filtroNombre) {
			System.out.println(cliente);
		}
		
		

		System.out.println("Clientes:");
		List<Cliente> listadoClientes = clienteServicio.getClientes();
		System.out.println(listadoClientes);
		
		//Falta buscar el primer cliente que seria sacando la posicion 0 de la id y actualizando mediante un setnombre y agregandolo a clienteServicio.updateCliente 
		//por 'ultimo eliminar el cliente por ID seriia sacando la ID del cliente despues mediante clienteServicio.deleteCliente se borraria.
		
		
				
		
	}

}
