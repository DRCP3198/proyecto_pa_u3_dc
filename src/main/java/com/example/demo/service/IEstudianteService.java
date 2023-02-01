package com.example.demo.service;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteService {

	public Estudiante encontrarPorNombre(String nombre);
	public Estudiante encontrarPorApellido(String apellido);
}
