package com.example.desafio3.repository;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NOMBRE", nullable = false)
	private String nombre;
	
	@Column(name = "APELLIDOS", nullable = false)
	private String apellidos;
	
	@Column(name = "FECHANACIMIENTO")
	private Date fNacimiento;
	
	@Column(name = "DNI")
	private String DNI;

	public Cliente() {
		super();
	}

	public Cliente(String nombre, String apellidos, Date fechaNacimiento, String DNI) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fNacimiento = fechaNacimiento;
		this.DNI = DNI;
	}

	public Cliente(Long id, String nombre, String apellidos, Date fechaNacimiento, String DNI) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fNacimiento = fechaNacimiento;
		this.DNI = DNI;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaNacimiento() {
		return fNacimiento;
	}

	public void setFNacimiento(Date fNacimiento) {
		this.fNacimiento = fNacimiento;
	}

	public String getDni() {
		return DNI;
	}

	public void setDni(String dni) {
		this.DNI = dni;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ fNacimiento + ", nSeguridadSocial=" + DNI + "]";
	}
	
}
	
	
	

