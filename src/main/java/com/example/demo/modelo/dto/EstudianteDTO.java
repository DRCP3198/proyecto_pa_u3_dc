package com.example.demo.modelo.dto;

import jakarta.persistence.Column;

public class EstudianteDTO {
	
	//Declaro los campos que necesito sin la  anotacion 
	
	private String nombre;

	private String apellido;

	private String cedula;

	//COnstructor por defecto se le coloca por buena practica
	//cuando creo un constructor cargado
	
	public EstudianteDTO() {
		
	}
	//CONSTRUCTOR CON LOS ATRIBUTOS
	public EstudianteDTO(String nombre, String apellido, String cedula) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}

	
	
	//SET y GET
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	//PARA IMPRIMIR ME SIRVE EL TOSTRING
	@Override
	public String toString() {
		return "EstudianteDTO [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + "]";
	}
	
	

}
