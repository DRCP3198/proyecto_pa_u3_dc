package com.example.demo.service;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteService {

	public Estudiante encontrarPorNombre(String nombre);
	public Estudiante encontrarPorApellido(String apellido);
	public void agregar(Estudiante estudiante);
	public Estudiante encontrarPorCedula(String cedula);
	public Estudiante encontrarPorGenero(String genero);
	public Estudiante encontrarPorCiudad(String ciudad);
	//TYPE QUERY
	public Estudiante encontrarPorNombreQueryType(String nombre);
	public Estudiante encontrarPorNombreNamedQuery(String nombre);
	public Estudiante encontrarPorNombreNamedQueryType(String nombre);
	

	public Estudiante encontrarrPorNombreNativeQuery(String nombre);
	
	public Estudiante encontrarPorNombreNativeTypeNamed(String nombre);
}
