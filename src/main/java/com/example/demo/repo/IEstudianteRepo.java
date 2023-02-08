package com.example.demo.repo;

import java.util.List;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;

public interface IEstudianteRepo {
	public void insertar(Estudiante estudiante);
	public Estudiante buscarPorNombreQuery(String nombre);
	public Estudiante buscarPorApellidoQuery(String apellido);
	
	public Estudiante buscarPorCedulaQuery(String cedula);
	public Estudiante buscarPorGeneroQuery(String genero);
	public Estudiante buscarPorCiudadQuery(String ciudad);
	
	public Estudiante buscarPorNombreQueryType(String nombre);
	public Estudiante buscarPorNombreNamedQuery(String nombre);
	public Estudiante buscarPorNombreNamedQueryType(String nombre);
	
	public Estudiante buscarPorNombreNativeQuery(String nombre);
	
	public Estudiante buscarPorNombreNativeTypeNamed(String nombre);
	//************************************************
	public List<Estudiante> buscarPorNombreQueryList(String nombre);
	
	public Estudiante buscarPorNombreQueryListPrimerElementoLista(String nombre);
	
	//***
	public EstudianteDTO buscarPorNombreQueryTypeDTO(String nombre);


}
