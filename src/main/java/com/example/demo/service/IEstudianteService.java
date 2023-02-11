package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;

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
	
	//
	public List<Estudiante> encontrarPorNombreQueryList(String nombre);
	public Estudiante encontrarPorNombreQueryListPrimerElementoLista(String nombre);
	
	//**
	//***
	public List<EstudianteDTO> encontrarPorNombreQueryTypeDTO(String nombre);
		
	//CRITERIAL API QUERY
	//CRITERIA API QUERY
	public List<Estudiante> encontrarPorNombreCriterial(String nombre);
	
	public List<Estudiante> encontrarPorNombreCriterialAndOr(String nombre,String apellido,String bandera);
}
