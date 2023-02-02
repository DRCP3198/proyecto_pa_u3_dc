package com.example.demo.repo;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteRepo {
	public void insertar(Estudiante estudiante);
	public Estudiante buscarPorNombreQuery(String nombre);
	public Estudiante buscarPorApellidoQuery(String apellido);
	
	public Estudiante buscarPorCedulaQuery(String cedula);
	public Estudiante buscarPorGeneroQuery(String genero);
	public Estudiante buscarPorCiudadQuery(String ciudad);

}
