package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;
import com.example.demo.repo.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService{

	
	@Autowired
	private IEstudianteRepo estudianteRepo;

	@Override
	public Estudiante encontrarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQuery(nombre);
	}
	@Override
	public void agregar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.insertar(estudiante);
		
	}


	@Override
	public Estudiante encontrarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorApellidoQuery(apellido);
	}

	
	@Override
	public Estudiante encontrarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorCedulaQuery(cedula);
	}

	@Override
	public Estudiante encontrarPorGenero(String genero) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorGeneroQuery(genero);
	}

	@Override
	public Estudiante encontrarPorCiudad(String ciudad) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorCiudadQuery(ciudad);
	}
	@Override
	public Estudiante encontrarPorNombreQueryType(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQueryType(nombre);
	}
	@Override
	public Estudiante encontrarPorNombreNamedQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreNamedQuery(nombre);
	}
	@Override
	public Estudiante encontrarPorNombreNamedQueryType(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreNamedQueryType(nombre);
	}
	@Override
	public Estudiante encontrarrPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreNativeQuery(nombre);
	}
	@Override
	public Estudiante encontrarPorNombreNativeTypeNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreNativeTypeNamed(nombre);
	}
	@Override
	public List<Estudiante> encontrarPorNombreQueryList(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQueryList(nombre);
	}
	@Override
	public Estudiante encontrarPorNombreQueryListPrimerElementoLista(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQueryListPrimerElementoLista(nombre);
	}
	//Estudiante DTO
	@Override
	public List<EstudianteDTO> encontrarPorNombreQueryTypeDTO(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQueryTypeDTO(nombre);
	}
	
	//CRITERIAL API QUERY
	@Override
	public List<Estudiante> encontrarPorNombreCriterial(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreCriterial(nombre);
	}
	@Override
	public List<Estudiante> encontrarPorNombreCriterialAndOr(String nombre, String apellido, String bandera) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreCriterialAndOr(nombre, apellido, bandera);
	}
}
